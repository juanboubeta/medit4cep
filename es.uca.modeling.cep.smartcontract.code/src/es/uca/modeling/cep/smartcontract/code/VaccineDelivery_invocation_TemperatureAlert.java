
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

public class VaccineDelivery_invocation_TemperatureAlert {
	
	private final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
	private final static BigInteger GAS_PRICE = BigInteger.valueOf(2000000000L);
	private final static String PRIVATE_KEY = "6c03bc6eade02759fcb1c64bc703709378107aec4fb6a0cc69ca078901109f34";
	private final static String CONTRACT_ADDRESS = "0x7966c3db17e8974c4834a16b9bb320555e5b48db";

	
	private final static BigInteger VAR_elementIndex = BigInteger.valueOf(2L);		
	private final static String VAR__name = "name";		
	private final static String VAR__info = "info";		
	
		
	public static void main(String[] args) {
		try {
			new VaccineDelivery_invocation_TemperatureAlert();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public VaccineDelivery_invocation_TemperatureAlert() throws Exception {
		
		Web3j web3j = Web3j.build(new HttpService());
		Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
		System.out.println(web3ClientVersion.getWeb3ClientVersion());
		
		Credentials credentials = getCredentialsFromPrivateKey();		

		VaccineDelivery smartContract = loadContract(CONTRACT_ADDRESS, web3j, credentials);
		
		System.out.println("Deployed contract address: " + smartContract.getContractAddress());
		
		
		smartContract.registerEvent_complete(VAR_elementIndex,VAR__name,VAR__info).send();
		
	}
	
	private Credentials getCredentialsFromPrivateKey() {
		//The create method receives a private key to generate the credentials 
		return Credentials.create(PRIVATE_KEY);
	}
		
	private VaccineDelivery loadContract(String contractAddress, Web3j web3j, Credentials credentials) {
		return VaccineDelivery.load(contractAddress, web3j, credentials, GAS_PRICE, GAS_LIMIT);
	}
	
}