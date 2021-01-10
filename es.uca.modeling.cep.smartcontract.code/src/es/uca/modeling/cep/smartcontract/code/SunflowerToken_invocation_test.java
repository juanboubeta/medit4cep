
package es.uca.modeling.cep.smartcontract.code;

import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SunflowerToken_invocation_test {
	
	private final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
	private final static BigInteger GAS_PRICE = BigInteger.valueOf(2000000000L);
	private final static String PRIVATE_KEY = "asdf";
	private final static String CONTRACT_ADDRESS = "0x8ab98C28295Ea3BD2DB6aC8b3CA57A625C054BD1";

	
	private final static String VAR_Approval_owner = "";		
	private final static String VAR_Approval_spender = "";		
	private final static BigInteger VAR_Approval_value = BigInteger.valueOf(L);		
	private final static String VAR_DelegateChanged_delegator = "";		
	private final static String VAR_DelegateChanged_fromDelegate = "";		
	private final static String VAR_DelegateChanged_toDelegate = "";		
	private final static String VAR_DelegateVotesChanged_delegate = "";		
	private final static BigInteger VAR_DelegateVotesChanged_previousBalance = BigInteger.valueOf(L);		
	private final static BigInteger VAR_DelegateVotesChanged_newBalance = BigInteger.valueOf(L);		
	private final static String VAR_OwnershipTransferred_previousOwner = "";		
	private final static String VAR_OwnershipTransferred_newOwner = "";		
	private final static String VAR_Transfer_from = "";		
	private final static String VAR_Transfer_to = "";		
	private final static BigInteger VAR_Transfer_value = BigInteger.valueOf(L);		
	
		
	public static void main(String[] args) {
		try {
			new SunflowerToken_invocation_test();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public SunflowerToken_invocation_test() throws Exception {
		
		Web3j web3j = Web3j.build(new HttpService());
		Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
		System.out.println(web3ClientVersion.getWeb3ClientVersion());
		
		Credentials credentials = getCredentialsFromPrivateKey();		

		SunflowerToken smartContract = loadContract(CONTRACT_ADDRESS, web3j, credentials);
		
		System.out.println("Deployed contract address: " + smartContract.getContractAddress());
		
		
		smartContract.Approval(VAR_Approval_owner,VAR_Approval_spender,VAR_Approval_value).send();
		smartContract.DelegateChanged(VAR_DelegateChanged_delegator,VAR_DelegateChanged_fromDelegate,VAR_DelegateChanged_toDelegate).send();
		smartContract.DelegateVotesChanged(VAR_DelegateVotesChanged_delegate,VAR_DelegateVotesChanged_previousBalance,VAR_DelegateVotesChanged_newBalance).send();
		smartContract.OwnershipTransferred(VAR_OwnershipTransferred_previousOwner,VAR_OwnershipTransferred_newOwner).send();
		smartContract.Transfer(VAR_Transfer_from,VAR_Transfer_to,VAR_Transfer_value).send();
		
	}
	
	private Credentials getCredentialsFromPrivateKey() {
		//The create method receives a private key to generate the credentials 
		return Credentials.create(PRIVATE_KEY);
	}
		
	private SunflowerToken loadContract(String contractAddress, Web3j web3j, Credentials credentials) {
		return SunflowerToken.load(contractAddress, web3j, credentials, GAS_PRICE, GAS_LIMIT);
	}
	
}