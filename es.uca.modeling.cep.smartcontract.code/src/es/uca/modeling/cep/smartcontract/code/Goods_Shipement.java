package es.uca.modeling.cep.smartcontract.code;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
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
public class Goods_Shipement extends Contract {
    private static final String BINARY = "60806040526002600555600060065534801561001a57600080fd5b50604051606080610ce18339810160409081528151602083015191909201516000805433600160a060020a0319918216178255600180548216600160a060020a03968716179055600280548216948616949094179093556004805490931693909116929092179055610c4f90819061009290396000f3006080604052600436106100cf5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631d0c54d681146100d45780631fcf2036146100fb57806333a1a21014610115578063374be45f1461014657806362032c2a146101ab578063647950c5146101c35780636917151a146101d857806379a42d06146101ed5780637b193c45146102025780638050ed741461021a5780638b3fb1651461023d5780639d820b6c14610255578063da1b4fd61461026a578063e6ee588d1461027f575b600080fd5b3480156100e057600080fd5b506100e9610294565b60408051918252519081900360200190f35b34801561010757600080fd5b5061011360043561029a565b005b34801561012157600080fd5b5061012a6102e6565b60408051600160a060020a039092168252519081900360200190f35b34801561015257600080fd5b5061015b6102f5565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561019757818101518382015260200161017f565b505050509050019250505060405180910390f35b3480156101b757600080fd5b506100e9600435610357565b3480156101cf57600080fd5b50610113610369565b3480156101e457600080fd5b506100e961038e565b3480156101f957600080fd5b50610113610394565b34801561020e57600080fd5b506101136004356103ac565b34801561022657600080fd5b5061011360043560243560443560643515156103c8565b34801561024957600080fd5b506101136004356104a3565b34801561026157600080fd5b506101136104ea565b34801561027657600080fd5b5061012a610515565b34801561028b57600080fd5b506100e9610524565b60055481565b60055460065460048314156102e157600254600160a060020a0316331480156102c557506010811615155b15156102d057600080fd5b6102e160108317601019831661052a565b505050565b600454600160a060020a031681565b6060600780548060200260200160405190810160405280929190818152602001828054801561034d57602002820191906000526020600020905b8154600160a060020a0316815260019091019060200180831161032f575b5050505050905090565b60009081526008602052604090205490565b60008061037c6005546006546000610738565b9150915061038a828261052a565b5050565b60065481565b6103a46000600554600654610828565b600655600555565b600154600160a060020a031633146103c357600080fd5b600355565b600554600654600360009081526008602052600080516020610c0483398151915254600286900a919082161561047d57841561041f5760036000526008602052600080516020610c04833981519152805483191690555b7f44656661756c74000000000000000000000000000000000000000000000000008714156104785760036000526008602052600080516020610c048339815191525415156104785761047860088517600819851661052a565b610499565b61048a8888868685610928565b9094509250610499848461052a565b5050505050505050565b60055460065460018314156102e157600254600160a060020a0316331480156104ce57506002811615155b15156104d957600080fd5b6102e160048317600219831661052a565b60026005541480156104fc5750600654155b151561050757600080fd5b6105136002600061052a565b565b600254600160a060020a031690565b60035490565b60005b60088316156105c657600254604080517f688043d8000000000000000000000000000000000000000000000000000000008152600160048201529051600160a060020a039092169163688043d89160248082019260009290919082900301818387803b15801561059c57600080fd5b505af11580156105b0573d6000803e3d6000fd5b505050506008198316925060028217915061052d565b600483161561064457600419831692601a161580156105e65750601a8216155b1561063f576106397f476f6f64735f536869706d656e745f436f6d706c6574656400000000000000007f44656661756c740000000000000000000000000000000000000000000000000085856004610928565b90935091505b61052d565b601083161561067e575060005b600281101561066c576106646003610a83565b600101610651565b6010198316925060088217915061052d565b600283161561071657600254604080517ffe79372f0000000000000000000000000000000000000000000000000000000081526004818101529051600160a060020a039092169163fe79372f9160248082019260009290919082900301818387803b1580156106ec57600080fd5b505af1158015610700573d6000803e3d6000fd5b505050506002198316925060108217915061052d565b600554151580610727575060065415155b156102e15750600591909155600655565b600080808060088616156107665760036000526008602052600080516020610c048339815191525491909117905b84199190911690811561081d575060005b60075481101561081d57600281900a82161561081557600780548290811061079b57fe5b6000918252602082200154604080517f647950c50000000000000000000000000000000000000000000000000000000081529051600160a060020a039092169263647950c59260048084019382900301818387803b1580156107fc57600080fd5b505af1158015610810573d6000803e3d6000fd5b505050505b600101610777565b509495939450505050565b6000808080808715156108415760009550859650600892505b600883161561087057600360009081526008602052600080516020610c04833981519152805491905591909117905b5060005b60075481101561091a57600281900a82161561091257600780548290811061089857fe5b6000918252602082200154604080517f79a42d060000000000000000000000000000000000000000000000000000000081529051600160a060020a03909216926379a42d069260048084019382900301818387803b1580156108f957600080fd5b505af115801561090d573d6000803e3d6000fd5b505050505b600101610874565b509496939550929350505050565b6000807f4572726f7200000000000000000000000000000000000000000000000000000086148061097857507f5465726d696e617465000000000000000000000000000000000000000000000086145b156109935761098960008686610828565b90955093506109cc565b7f5369676e616c00000000000000000000000000000000000000000000000000008614156109cc576109c6858585610738565b90955093505b600154600160a060020a031615610a7657600154600354604080517f8050ed74000000000000000000000000000000000000000000000000000000008152600481018b9052602481018a9052604481019290925287871715606483015251600160a060020a0390921691638050ed749160848082019260009290919082900301818387803b158015610a5d57600080fd5b505af1158015610a71573d6000803e3d6000fd5b505050505b5092959194509092505050565b60048054604080517fc87115a9000000000000000000000000000000000000000000000000000000008152928301849052306024840152516000928392600160a060020a03169163c87115a99160448082019260209290919082900301818787803b158015610af157600080fd5b505af1158015610b05573d6000803e3d6000fd5b505050506040513d6020811015610b1b57600080fd5b505160078054600181019091557fa66cc928b5edb82af9bd49922954155ab7b0942694bea4ce44661d9a8736c6888101805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0384169081179091556000868152600860205260408082208054600286900a17905580517f7b193c450000000000000000000000000000000000000000000000000000000081526004810185905290519496509294509092637b193c4592602480820193929182900301818387803b158015610be657600080fd5b505af1158015610bfa573d6000803e3d6000fd5b505050505050505600625b35f5e76f098dd7c3a05b10e2e5e78a4a01228d60c3b143426cdf36d26455a165627a7a72305820b50ebe70681daaa3a3e198a44de4985b5100f4b7cf847d02476bfb23d2a888970029";

    public static final String FUNC_MARKING = "marking";

    public static final String FUNC_REQUEST_QUOTES_COMPLETE = "Request_Quotes_complete";

    public static final String FUNC_PROCESSREGISTRY = "processRegistry";

    public static final String FUNC_ALLINSTANCEADDRESSES = "allInstanceAddresses";

    public static final String FUNC_STARTEDINSTANCEINDEXFOR = "startedInstanceIndexFor";

    public static final String FUNC_BROADCASTSIGNAL = "broadcastSignal";

    public static final String FUNC_STARTEDACTIVITIES = "startedActivities";

    public static final String FUNC_KILLPROCESS = "killProcess";

    public static final String FUNC_SETINSTANCEINDEX = "setInstanceIndex";

    public static final String FUNC_HANDLEEVENT = "handleEvent";

    public static final String FUNC_SHIP_GOODS_COMPLETE = "Ship_Goods_complete";

    public static final String FUNC_STARTEXECUTION = "startExecution";

    public static final String FUNC_GETWORKLISTADDRESS = "getWorklistAddress";

    public static final String FUNC_GETINSTANCEINDEX = "getInstanceIndex";

    @Deprecated
    protected Goods_Shipement(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Goods_Shipement(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Goods_Shipement(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Goods_Shipement(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> marking() {
        final Function function = new Function(FUNC_MARKING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> Request_Quotes_complete(BigInteger elementIndex) {
        final Function function = new Function(
                FUNC_REQUEST_QUOTES_COMPLETE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(elementIndex)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> processRegistry() {
        final Function function = new Function(FUNC_PROCESSREGISTRY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<List> allInstanceAddresses() {
        final Function function = new Function(FUNC_ALLINSTANCEADDRESSES, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<BigInteger> startedInstanceIndexFor(BigInteger instanceNode) {
        final Function function = new Function(FUNC_STARTEDINSTANCEINDEXFOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(instanceNode)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
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

    public RemoteCall<TransactionReceipt> Ship_Goods_complete(BigInteger elementIndex) {
        final Function function = new Function(
                FUNC_SHIP_GOODS_COMPLETE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(elementIndex)), 
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
    public static Goods_Shipement load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Goods_Shipement(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Goods_Shipement load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Goods_Shipement(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Goods_Shipement load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Goods_Shipement(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Goods_Shipement load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Goods_Shipement(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Goods_Shipement> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Goods_Shipement.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Goods_Shipement> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Goods_Shipement.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Goods_Shipement> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Goods_Shipement.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Goods_Shipement> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _parent, String _worklist, String _processRegistry) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent), 
                new org.web3j.abi.datatypes.Address(_worklist), 
                new org.web3j.abi.datatypes.Address(_processRegistry)));
        return deployRemoteCall(Goods_Shipement.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }
}
