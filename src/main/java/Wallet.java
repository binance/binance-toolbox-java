import com.binance.connector.client.impl.SpotClientImpl;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

/**
 * Example on how to get all coin info, get deposit address and withdraw to deposit address.
 */
public class Wallet {
    private static final Logger logger = LoggerFactory.getLogger(Wallet.class);
    private static final SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

    public static void getCoinInfo() {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        String result = client.createWallet().coinInfo(parameters);
        logger.info(result);
    }

    public static String getDepositAddress() {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "BNB");

        String result = client.createWallet().depositAddress(parameters);
        logger.info(result);
        JSONObject jsonObject = new JSONObject(result);
        return jsonObject.getString("address");
    }

    public static void withdraw(String address) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "BNB");
        parameters.put("address", address);
        parameters.put("amount", "0.001");

        String result = client.createWallet().withdraw(parameters);
        logger.info(result);
    }

    public static void main(String[] args) {
        getCoinInfo();
        String address = getDepositAddress();
        withdraw(address);

    }
}
