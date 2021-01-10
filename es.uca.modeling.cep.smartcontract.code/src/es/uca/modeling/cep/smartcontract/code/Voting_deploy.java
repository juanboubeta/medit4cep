
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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Voting_deploy {
	
	private final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
	private final static BigInteger GAS_PRICE = BigInteger.valueOf(2000000000L);
	private final static String PRIVATE_KEY = "9a9433c40e630828955c1607f77928349ac7f8125a7b85f6c14a34166f5b04c0";
			
	public static void main(String[] args) {
		try {
			new Voting_deploy();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public Voting_deploy() throws Exception {
		
		
		Web3j web3j = Web3j.build(new HttpService());
		Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
		System.out.println(web3ClientVersion.getWeb3ClientVersion());
		
		Credentials credentials = getCredentialsFromPrivateKey();
				
		String deployedAddress = deployContract(web3j, credentials);
		
		File contractAddress = new File("Voting_contractAddress.txt");
		BufferedWriter bw;
		if(contractAddress.exists()) {
			bw = new BufferedWriter(new FileWriter(contractAddress));
			bw.write(deployedAddress);
			bw.close();
		} else {
			bw = new BufferedWriter(new FileWriter(contractAddress));
			bw.write(deployedAddress);
			bw.close();
		}
		
	}
	
	private Credentials getCredentialsFromPrivateKey() {
		//The create method receives a private key to generate the credentials 
		return Credentials.create(PRIVATE_KEY);
	}
	
	private String deployContract(Web3j web3j, Credentials credentials) throws Exception {
			return Voting.deploy(web3j, credentials, GAS_PRICE, GAS_LIMIT,"Candidato 1","Candidato 2","Candidato 3")
			.send()
			.getContractAddress();
	}	

}