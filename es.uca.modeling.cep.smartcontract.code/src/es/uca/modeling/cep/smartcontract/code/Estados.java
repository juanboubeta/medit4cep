package es.uca.modeling.cep.smartcontract.code;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
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
public class Estados extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060008054600181018083559180526040805180820190915260138082527f536f6c69636974756420526563696269646121000000000000000000000000006020909201918252610084927f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56301919061008b565b5050610126565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100cc57805160ff19168380011785556100f9565b828001600101855582156100f9579182015b828111156100f95782518255916020019190600101906100de565b50610105929150610109565b5090565b61012391905b80821115610105576000815560010161010f565b90565b610322806101356000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80634142db7d1461003b5780639235f089146100b8575b600080fd5b610043610160565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561007d578181015183820152602001610065565b50505050905090810190601f1680156100aa5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b61015e600480360360208110156100ce57600080fd5b8101906020810181356401000000008111156100e957600080fd5b8201836020820111156100fb57600080fd5b8035906020019184600183028401116401000000008311171561011d57600080fd5b91908080601f01602080910402602001604051908101604052809392919081815260200183838082843760009201919091525092955061020f945050505050565b005b6000805460609190600019810190811061017657fe5b600091825260209182902001805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152928301828280156102045780601f106101d957610100808354040283529160200191610204565b820191906000526020600020905b8154815290600101906020018083116101e757829003601f168201915b505050505090505b90565b60008054600181018083559180528251610250917f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56301906020850190610255565b505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061029657805160ff19168380011785556102c3565b828001600101855582156102c3579182015b828111156102c35782518255916020019190600101906102a8565b506102cf9291506102d3565b5090565b61020c91905b808211156102cf57600081556001016102d956fea265627a7a72305820337931a069c36a407cbf551eae9fa08b98cc44a68d7573d50a1dd238fe66fee664736f6c63430005090032";

    public static final String FUNC_VERESTADOSOLICITUD = "verEstadoSolicitud";

    public static final String FUNC_ACTUALIZARESTADO = "actualizarEstado";

    @Deprecated
    protected Estados(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Estados(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Estados(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Estados(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> verEstadoSolicitud() {
        final Function function = new Function(FUNC_VERESTADOSOLICITUD, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> actualizarEstado(String estado) {
        final Function function = new Function(
                FUNC_ACTUALIZARESTADO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(estado)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Estados load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Estados(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Estados load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Estados(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Estados load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Estados(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Estados load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Estados(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Estados> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Estados.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Estados> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Estados.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Estados> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Estados.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Estados> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Estados.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
