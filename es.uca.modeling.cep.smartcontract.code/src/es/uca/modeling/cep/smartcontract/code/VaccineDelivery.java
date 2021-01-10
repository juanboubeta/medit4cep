package es.uca.modeling.cep.smartcontract.code;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.3.0.
 */
public class VaccineDelivery extends Contract {
    private static final String BINARY = "60806040526004600555600060065534801561001a57600080fd5b506040516060806107238339810160409081528151602083015191909201516000805433600160a060020a0319918216178255600180548216600160a060020a0396871617905560028054821694861694909417909355600480549093169390911692909217905561069190819061009290396000f3006080604052600436106100ae5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d0c54d681146100b357806333a1a210146100da578063647950c51461010b5780636917151a1461012257806379a42d06146101375780637b193c451461014c5780638050ed741461016457806385bf66bc146101875780639d820b6c146101b7578063da1b4fd6146101cc578063e6ee588d146101e1575b600080fd5b3480156100bf57600080fd5b506100c86101f6565b60408051918252519081900360200190f35b3480156100e657600080fd5b506100ef6101fc565b60408051600160a060020a039092168252519081900360200190f35b34801561011757600080fd5b5061012061020b565b005b34801561012e57600080fd5b506100c8610230565b34801561014357600080fd5b50610120610236565b34801561015857600080fd5b5061012060043561024e565b34801561017057600080fd5b50610120600435602435604435606435151561026a565b34801561019357600080fd5b50610120600480359060248035808201929081013591604435908101910135610270565b3480156101c357600080fd5b506101206102da565b3480156101d857600080fd5b506100ef610305565b3480156101ed57600080fd5b506100c8610315565b60055481565b600454600160a060020a031681565b60008061021e600554600654600061031b565b9150915061022c8282610320565b5050565b60065481565b6102466000600554600654610456565b600655600555565b600154600160a060020a0316331461026557600080fd5b600355565b50505050565b60055460065460018714156102d157600254600160a060020a03163314801561029b57506002811615155b15156102a657600080fd5b6102b2600787876105cd565b506102bf600885856105cd565b506102d1600283176002198316610320565b50505050505050565b60046005541480156102ec5750600654155b15156102f757600080fd5b61030360046000610320565b565b600254600160a060020a03165b90565b60035490565b509091565b60048216156103b757600254604080517f2a6e4393000000000000000000000000000000000000000000000000000000008152600160048201529051600160a060020a0390921691632a6e43939160248082019260009290919082900301818387803b15801561038f57600080fd5b505af11580156103a3573d6000803e3d6000fd5b505050600419929092169150600217610320565b6002821615610435576002198216916004161580156103d7575060028116155b156104305761042a7f56616363696e655f48616e646c696e675f436f6d706c657465640000000000007f44656661756c740000000000000000000000000000000000000000000000000084846004610472565b90925090505b610320565b600554151580610446575060065415155b1561022c57600591909155600655565b60008084151561046857600092508293505b5091939092509050565b6000807f4572726f720000000000000000000000000000000000000000000000000000008614806104c257507f5465726d696e617465000000000000000000000000000000000000000000000086145b156104dd576104d360008686610456565b9095509350610516565b7f5369676e616c00000000000000000000000000000000000000000000000000008614156105165761051085858561031b565b90955093505b600154600160a060020a0316156105c057600154600354604080517f8050ed74000000000000000000000000000000000000000000000000000000008152600481018b9052602481018a9052604481019290925287871715606483015251600160a060020a0390921691638050ed749160848082019260009290919082900301818387803b1580156105a757600080fd5b505af11580156105bb573d6000803e3d6000fd5b505050505b5092959194509092505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061060e5782800160ff1982351617855561063b565b8280016001018555821561063b579182015b8281111561063b578235825591602001919060010190610620565b5061064792915061064b565b5090565b61031291905b8082111561064757600081556001016106515600a165627a7a72305820c72472ba50a6e623da792836fa42c55ab8b27a7a7f036cfb8ae46fe885c2a8920029";

    public static final String FUNC_MARKING = "marking";

    public static final String FUNC_PROCESSREGISTRY = "processRegistry";

    public static final String FUNC_BROADCASTSIGNAL = "broadcastSignal";

    public static final String FUNC_STARTEDACTIVITIES = "startedActivities";

    public static final String FUNC_KILLPROCESS = "killProcess";

    public static final String FUNC_SETINSTANCEINDEX = "setInstanceIndex";

    public static final String FUNC_HANDLEEVENT = "handleEvent";

    public static final String FUNC_REGISTEREVENT_COMPLETE = "registerEvent_complete";

    public static final String FUNC_STARTEXECUTION = "startExecution";

    public static final String FUNC_GETWORKLISTADDRESS = "getWorklistAddress";

    public static final String FUNC_GETINSTANCEINDEX = "getInstanceIndex";

    @Deprecated
    protected VaccineDelivery(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected VaccineDelivery(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected VaccineDelivery(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected VaccineDelivery(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> marking() {
        final Function function = new Function(FUNC_MARKING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> processRegistry() {
        final Function function = new Function(FUNC_PROCESSREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> broadcastSignal() {
        final Function function = new Function(
                FUNC_BROADCASTSIGNAL, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> startedActivities() {
        final Function function = new Function(FUNC_STARTEDACTIVITIES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> killProcess() {
        final Function function = new Function(
                FUNC_KILLPROCESS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setInstanceIndex(BigInteger _instanceIndex) {
        final Function function = new Function(
                FUNC_SETINSTANCEINDEX, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_instanceIndex)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> handleEvent(byte[] code, byte[] eventType, BigInteger _instanceIndex, Boolean isInstanceCompleted) {
        final Function function = new Function(
                FUNC_HANDLEEVENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(code), 
                new org.web3j.abi.datatypes.generated.Bytes32(eventType), 
                new org.web3j.abi.datatypes.generated.Uint256(_instanceIndex), 
                new org.web3j.abi.datatypes.Bool(isInstanceCompleted)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> registerEvent_complete(BigInteger elementIndex, String _name, String _info) {
        final Function function = new Function(
                FUNC_REGISTEREVENT_COMPLETE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(elementIndex), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_info)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> startExecution() {
        final Function function = new Function(
                FUNC_STARTEXECUTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getWorklistAddress() {
        final Function function = new Function(FUNC_GETWORKLISTADDRESS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getInstanceIndex() {
        final Function function = new Function(FUNC_GETINSTANCEINDEX, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static VaccineDelivery load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new VaccineDelivery(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static VaccineDelivery load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new VaccineDelivery(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static VaccineDelivery load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new VaccineDelivery(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static VaccineDelivery load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new VaccineDelivery(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<VaccineDelivery> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(VaccineDelivery.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<VaccineDelivery> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(VaccineDelivery.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<VaccineDelivery> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(VaccineDelivery.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<VaccineDelivery> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(VaccineDelivery.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
