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
public class Invoice_Handling extends Contract {
    private static final String BINARY = "60806040526002600555600060065534801561001a57600080fd5b506040516060806107e08339810160409081528151602083015191909201516000805433600160a060020a0319918216178255600180548216600160a060020a0396871617905560028054821694861694909417909355600480549093169390911692909217905561074e90819061009290396000f3006080604052600436106100b95763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d0c54d681146100be57806333a1a210146100e5578063647950c5146101165780636917151a1461012d57806379a42d06146101425780637b193c45146101575780638050ed741461016f5780639d820b6c146101925780639e64b7dc146101a7578063b2980fe3146101bf578063da1b4fd6146101dc578063e6ee588d146101f1575b600080fd5b3480156100ca57600080fd5b506100d3610206565b60408051918252519081900360200190f35b3480156100f157600080fd5b506100fa61020c565b60408051600160a060020a039092168252519081900360200190f35b34801561012257600080fd5b5061012b61021b565b005b34801561013957600080fd5b506100d3610240565b34801561014e57600080fd5b5061012b610246565b34801561016357600080fd5b5061012b60043561025e565b34801561017b57600080fd5b5061012b600435602435604435606435151561027a565b34801561019e57600080fd5b5061012b610280565b3480156101b357600080fd5b5061012b6004356102ab565b3480156101cb57600080fd5b5061012b60043560243515156102f7565b3480156101e857600080fd5b506100fa610351565b3480156101fd57600080fd5b506100d3610360565b60055481565b600454600160a060020a031681565b60008061022e6005546006546000610366565b9150915061023c828261036b565b5050565b60065481565b61025660006005546006546105ab565b600655600555565b600154600160a060020a0316331461027557600080fd5b600355565b50505050565b60026005541480156102925750600654155b151561029d57600080fd5b6102a96002600061036b565b565b60055460065460018314156102f257600254600160a060020a0316331480156102d657506002811615155b15156102e157600080fd5b6102f260048317600219831661036b565b505050565b600554600654600284141561027a57600254600160a060020a03163314801561032257506004811615155b151561032d57600080fd5b6007805460ff191684151517905561034c60108317600419831661036b565b61027a565b600254600160a060020a031690565b60035490565b509091565b600282161561040257600254604080517f6a340937000000000000000000000000000000000000000000000000000000008152600160048201529051600160a060020a0390921691636a3409379160248082019260009290919082900301818387803b1580156103da57600080fd5b505af11580156103ee573d6000803e3d6000fd5b50505060021992909216915060021761036b565b60088216156104995760028054604080517f2d0c4a96000000000000000000000000000000000000000000000000000000008152600481019390935251600160a060020a0390911691632d0c4a9691602480830192600092919082900301818387803b15801561047157600080fd5b505af1158015610485573d6000803e3d6000fd5b50505060081992909216915060041761036b565b60848216156104b4576084198216915060088217915061036b565b60108216156104e757600754601019929092169160ff16156104db576020821791506104e2565b6040821791505b61036b565b60208216156105645760201982169160de16158015610507575060468116155b156104e25761055a7f496e766f6963655f48616e646c696e675f436f6d706c657465640000000000007f44656661756c7400000000000000000000000000000000000000000000000000848460206105c7565b909250905061036b565b604082161561058a576007805460ff19166001179055604019919091166080179061036b565b60055415158061059b575060065415155b1561023c57600591909155600655565b6000808415156105bd57600092508293505b5091939092509050565b6000807f4572726f7200000000000000000000000000000000000000000000000000000086148061061757507f5465726d696e617465000000000000000000000000000000000000000000000086145b1561063257610628600086866105ab565b909550935061066b565b7f5369676e616c000000000000000000000000000000000000000000000000000086141561066b57610665858585610366565b90955093505b600154600160a060020a03161561071557600154600354604080517f8050ed74000000000000000000000000000000000000000000000000000000008152600481018b9052602481018a9052604481019290925287871715606483015251600160a060020a0390921691638050ed749160848082019260009290919082900301818387803b1580156106fc57600080fd5b505af1158015610710573d6000803e3d6000fd5b505050505b50929591945090925050505600a165627a7a72305820e384818b766011014f98e4b8fe0fea5d9943102a2bb1847e33a683632f4b89290029";

    public static final String FUNC_MARKING = "marking";

    public static final String FUNC_PROCESSREGISTRY = "processRegistry";

    public static final String FUNC_BROADCASTSIGNAL = "broadcastSignal";

    public static final String FUNC_STARTEDACTIVITIES = "startedActivities";

    public static final String FUNC_KILLPROCESS = "killProcess";

    public static final String FUNC_SETINSTANCEINDEX = "setInstanceIndex";

    public static final String FUNC_HANDLEEVENT = "handleEvent";

    public static final String FUNC_STARTEXECUTION = "startExecution";

    public static final String FUNC_ISSUE_INVOICE_COMPLETE = "Issue_Invoice_complete";

    public static final String FUNC_APPROVE_INVOICE_COMPLETE = "Approve_Invoice_complete";

    public static final String FUNC_GETWORKLISTADDRESS = "getWorklistAddress";

    public static final String FUNC_GETINSTANCEINDEX = "getInstanceIndex";

    @Deprecated
    protected Invoice_Handling(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Invoice_Handling(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Invoice_Handling(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Invoice_Handling(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
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

    public RemoteCall<TransactionReceipt> startExecution() {
        final Function function = new Function(
                FUNC_STARTEXECUTION, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> Issue_Invoice_complete(BigInteger elementIndex) {
        final Function function = new Function(
                FUNC_ISSUE_INVOICE_COMPLETE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(elementIndex)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> Approve_Invoice_complete(BigInteger elementIndex, Boolean _accepted) {
        final Function function = new Function(
                FUNC_APPROVE_INVOICE_COMPLETE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(elementIndex), 
                new org.web3j.abi.datatypes.Bool(_accepted)), 
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
    public static Invoice_Handling load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Invoice_Handling(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Invoice_Handling load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Invoice_Handling(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Invoice_Handling load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Invoice_Handling(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Invoice_Handling load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Invoice_Handling(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Invoice_Handling> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Invoice_Handling.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Invoice_Handling> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Invoice_Handling.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Invoice_Handling> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Invoice_Handling.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Invoice_Handling> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Invoice_Handling.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
