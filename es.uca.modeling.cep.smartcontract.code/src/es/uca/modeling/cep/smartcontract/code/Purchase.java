package es.uca.modeling.cep.smartcontract.code;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
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
public class Purchase extends Contract {
    private static final String BINARY = "6080604052600180546001600160a01b03191633179055600234046000819055600202341461002d57600080fd5b6103e28061003c6000396000f3fe6080604052600436106100705760003560e01c80637150d8ae1161004e5780637150d8ae146100e457806373fac6f0146100f9578063c19d93fb1461010e578063d69606971461014757610070565b806308551a531461007557806335a063b4146100a65780633fa4f245146100bd575b600080fd5b34801561008157600080fd5b5061008a61014f565b604080516001600160a01b039092168252519081900360200190f35b3480156100b257600080fd5b506100bb61015e565b005b3480156100c957600080fd5b506100d2610219565b60408051918252519081900360200190f35b3480156100f057600080fd5b5061008a61021f565b34801561010557600080fd5b506100bb61022e565b34801561011a57600080fd5b5061012361031a565b6040518082600281111561013357fe5b60ff16815260200191505060405180910390f35b6100bb61032a565b6001546001600160a01b031681565b6001546001600160a01b0316331461017557600080fd5b60008060028054600160a01b900460ff169081111561019057fe5b1461019a57600080fd5b6040517f72c874aeff0b183a56e2b79c71b46e1aed4dee5e09862134b8821ba2fddbf8bf90600090a160028054819060ff60a01b1916600160a01b8202179055506001546040516001600160a01b0390911690303180156108fc02916000818181858888f19350505050158015610215573d6000803e3d6000fd5b5050565b60005481565b6002546001600160a01b031681565b6002546001600160a01b0316331461024557600080fd5b60018060028054600160a01b900460ff169081111561026057fe5b1461026a57600080fd5b6040517fe89152acd703c9d8c7d28829d443260b411454d45394e7995815140c8cbcbcf790600090a16002805460ff60a01b1916600160a11b1790819055600080546040516001600160a01b039093169281156108fc0292818181858888f193505050501580156102df573d6000803e3d6000fd5b506001546040516001600160a01b0390911690303180156108fc02916000818181858888f19350505050158015610215573d6000803e3d6000fd5b600254600160a01b900460ff1681565b60008060028054600160a01b900460ff169081111561034557fe5b1461034f57600080fd5b60005460020234148061036157600080fd5b6040517fd5d55c8a68912e9a110618df8d5e2e83b8d83211c57a8ddd1203df92885dc88190600090a15050600280546001600160a01b031916331760ff60a01b1916600160a01b17905556fea265627a7a72305820d38d865f78fac6d464e898da3becfd2cdbcdf25a90a2267d37814c3a5ed101e664736f6c63430005090032";

    public static final String FUNC_SELLER = "seller";

    public static final String FUNC_ABORT = "abort";

    public static final String FUNC_VALUE = "value";

    public static final String FUNC_BUYER = "buyer";

    public static final String FUNC_CONFIRMRECEIVED = "confirmReceived";

    public static final String FUNC_STATE = "state";

    public static final String FUNC_CONFIRMPURCHASE = "confirmPurchase";

    public static final Event ABORTED_EVENT = new Event("Aborted", 
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event PURCHASECONFIRMED_EVENT = new Event("PurchaseConfirmed", 
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event ITEMRECEIVED_EVENT = new Event("ItemReceived", 
            Arrays.<TypeReference<?>>asList());
    ;

    @Deprecated
    protected Purchase(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Purchase(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Purchase(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Purchase(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> seller() {
        final Function function = new Function(FUNC_SELLER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> abort() {
        final Function function = new Function(
                FUNC_ABORT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> value() {
        final Function function = new Function(FUNC_VALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> buyer() {
        final Function function = new Function(FUNC_BUYER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> confirmReceived() {
        final Function function = new Function(
                FUNC_CONFIRMRECEIVED, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> state() {
        final Function function = new Function(FUNC_STATE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> confirmPurchase(BigInteger weiValue) {
        final Function function = new Function(
                FUNC_CONFIRMPURCHASE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public List<AbortedEventResponse> getAbortedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ABORTED_EVENT, transactionReceipt);
        ArrayList<AbortedEventResponse> responses = new ArrayList<AbortedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AbortedEventResponse typedResponse = new AbortedEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AbortedEventResponse> abortedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, AbortedEventResponse>() {
            @Override
            public AbortedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ABORTED_EVENT, log);
                AbortedEventResponse typedResponse = new AbortedEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Flowable<AbortedEventResponse> abortedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ABORTED_EVENT));
        return abortedEventFlowable(filter);
    }

    public List<PurchaseConfirmedEventResponse> getPurchaseConfirmedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PURCHASECONFIRMED_EVENT, transactionReceipt);
        ArrayList<PurchaseConfirmedEventResponse> responses = new ArrayList<PurchaseConfirmedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PurchaseConfirmedEventResponse typedResponse = new PurchaseConfirmedEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PurchaseConfirmedEventResponse> purchaseConfirmedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, PurchaseConfirmedEventResponse>() {
            @Override
            public PurchaseConfirmedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PURCHASECONFIRMED_EVENT, log);
                PurchaseConfirmedEventResponse typedResponse = new PurchaseConfirmedEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Flowable<PurchaseConfirmedEventResponse> purchaseConfirmedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PURCHASECONFIRMED_EVENT));
        return purchaseConfirmedEventFlowable(filter);
    }

    public List<ItemReceivedEventResponse> getItemReceivedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ITEMRECEIVED_EVENT, transactionReceipt);
        ArrayList<ItemReceivedEventResponse> responses = new ArrayList<ItemReceivedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ItemReceivedEventResponse typedResponse = new ItemReceivedEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ItemReceivedEventResponse> itemReceivedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, ItemReceivedEventResponse>() {
            @Override
            public ItemReceivedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ITEMRECEIVED_EVENT, log);
                ItemReceivedEventResponse typedResponse = new ItemReceivedEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Flowable<ItemReceivedEventResponse> itemReceivedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ITEMRECEIVED_EVENT));
        return itemReceivedEventFlowable(filter);
    }

    @Deprecated
    public static Purchase load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Purchase(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Purchase load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Purchase(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Purchase load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Purchase(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Purchase load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Purchase(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Purchase> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, BigInteger initialWeiValue) {
        return deployRemoteCall(Purchase.class, web3j, credentials, contractGasProvider, BINARY, "", initialWeiValue);
    }

    public static RemoteCall<Purchase> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, BigInteger initialWeiValue) {
        return deployRemoteCall(Purchase.class, web3j, transactionManager, contractGasProvider, BINARY, "", initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<Purchase> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployRemoteCall(Purchase.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<Purchase> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployRemoteCall(Purchase.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static class AbortedEventResponse {
        public Log log;
    }

    public static class PurchaseConfirmedEventResponse {
        public Log log;
    }

    public static class ItemReceivedEventResponse {
        public Log log;
    }
}