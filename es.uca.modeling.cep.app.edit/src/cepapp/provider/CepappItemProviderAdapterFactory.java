/**
 */
package cepapp.provider;

import cepapp.util.CepappAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CepappItemProviderAdapterFactory extends CepappAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CepappItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.CEPApp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEPAppItemProvider cepAppItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.CEPApp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCEPAppAdapter() {
		if (cepAppItemProvider == null) {
			cepAppItemProvider = new CEPAppItemProvider(this);
		}

		return cepAppItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.InMemoryInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InMemoryInputItemProvider inMemoryInputItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.InMemoryInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInMemoryInputAdapter() {
		if (inMemoryInputItemProvider == null) {
			inMemoryInputItemProvider = new InMemoryInputItemProvider(this);
		}

		return inMemoryInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SourceEmail} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceEmailItemProvider sourceEmailItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SourceEmail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceEmailAdapter() {
		if (sourceEmailItemProvider == null) {
			sourceEmailItemProvider = new SourceEmailItemProvider(this);
		}

		return sourceEmailItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.InputFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputFileItemProvider inputFileItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.InputFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputFileAdapter() {
		if (inputFileItemProvider == null) {
			inputFileItemProvider = new InputFileItemProvider(this);
		}

		return inputFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SourceHttp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceHttpItemProvider sourceHttpItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SourceHttp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceHttpAdapter() {
		if (sourceHttpItemProvider == null) {
			sourceHttpItemProvider = new SourceHttpItemProvider(this);
		}

		return sourceHttpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SourceMqtt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceMqttItemProvider sourceMqttItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SourceMqtt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceMqttAdapter() {
		if (sourceMqttItemProvider == null) {
			sourceMqttItemProvider = new SourceMqttItemProvider(this);
		}

		return sourceMqttItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.EventProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventPropertyItemProvider eventPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.EventProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventPropertyAdapter() {
		if (eventPropertyItemProvider == null) {
			eventPropertyItemProvider = new EventPropertyItemProvider(this);
		}

		return eventPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.InMemoryOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InMemoryOutputItemProvider inMemoryOutputItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.InMemoryOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInMemoryOutputAdapter() {
		if (inMemoryOutputItemProvider == null) {
			inMemoryOutputItemProvider = new InMemoryOutputItemProvider(this);
		}

		return inMemoryOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.ComplexEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexEventItemProvider complexEventItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.ComplexEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplexEventAdapter() {
		if (complexEventItemProvider == null) {
			complexEventItemProvider = new ComplexEventItemProvider(this);
		}

		return complexEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.ComplexEventProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexEventPropertyItemProvider complexEventPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.ComplexEventProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComplexEventPropertyAdapter() {
		if (complexEventPropertyItemProvider == null) {
			complexEventPropertyItemProvider = new ComplexEventPropertyItemProvider(this);
		}

		return complexEventPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SinkEmail} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkEmailItemProvider sinkEmailItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SinkEmail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkEmailAdapter() {
		if (sinkEmailItemProvider == null) {
			sinkEmailItemProvider = new SinkEmailItemProvider(this);
		}

		return sinkEmailItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.OutputFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputFileItemProvider outputFileItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.OutputFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputFileAdapter() {
		if (outputFileItemProvider == null) {
			outputFileItemProvider = new OutputFileItemProvider(this);
		}

		return outputFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SinkRDBMS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//protected SinkRDBMSItemProvider sinkRDBMSItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SinkRDBMS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/*@Override
	public Adapter createSinkRDBMSAdapter() {
		if (sinkRDBMSItemProvider == null) {
			sinkRDBMSItemProvider = new SinkRDBMSItemProvider(this);
		}

		return sinkRDBMSItemProvider;
	}*/

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SinkMongoDB} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkMongoDBItemProvider sinkMongoDBItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SinkMongoDB}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkMongoDBAdapter() {
		if (sinkMongoDBItemProvider == null) {
			sinkMongoDBItemProvider = new SinkMongoDBItemProvider(this);
		}

		return sinkMongoDBItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SinkHttp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkHttpItemProvider sinkHttpItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SinkHttp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkHttpAdapter() {
		if (sinkHttpItemProvider == null) {
			sinkHttpItemProvider = new SinkHttpItemProvider(this);
		}

		return sinkHttpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link cepapp.SinkMqtt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinkMqttItemProvider sinkMqttItemProvider;

	/**
	 * This creates an adapter for a {@link cepapp.SinkMqtt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSinkMqttAdapter() {
		if (sinkMqttItemProvider == null) {
			sinkMqttItemProvider = new SinkMqttItemProvider(this);
		}

		return sinkMqttItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cepAppItemProvider != null) cepAppItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (inMemoryInputItemProvider != null) inMemoryInputItemProvider.dispose();
		if (sourceEmailItemProvider != null) sourceEmailItemProvider.dispose();
		if (inputFileItemProvider != null) inputFileItemProvider.dispose();
		if (sourceHttpItemProvider != null) sourceHttpItemProvider.dispose();
		if (sourceMqttItemProvider != null) sourceMqttItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (eventPropertyItemProvider != null) eventPropertyItemProvider.dispose();
		if (inMemoryOutputItemProvider != null) inMemoryOutputItemProvider.dispose();
		if (complexEventItemProvider != null) complexEventItemProvider.dispose();
		if (complexEventPropertyItemProvider != null) complexEventPropertyItemProvider.dispose();
		if (sinkEmailItemProvider != null) sinkEmailItemProvider.dispose();
		if (outputFileItemProvider != null) outputFileItemProvider.dispose();
		//if (sinkRDBMSItemProvider != null) sinkRDBMSItemProvider.dispose();
		if (sinkMongoDBItemProvider != null) sinkMongoDBItemProvider.dispose();
		if (sinkHttpItemProvider != null) sinkHttpItemProvider.dispose();
		if (sinkMqttItemProvider != null) sinkMqttItemProvider.dispose();
	}

}
