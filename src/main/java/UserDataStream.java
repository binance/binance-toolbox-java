import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.WebsocketClientImpl;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Getting listenkey and establing a user data stream.
 */

public class UserDataStream {
    private static final Logger logger = LoggerFactory.getLogger(UserDataStream.class);
    public static void main(String[] args) {
        WebsocketClientImpl wsClient = new WebsocketClientImpl();
        SpotClientImpl spotClient = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        JSONObject obj = new JSONObject(spotClient.createUserData().createListenKey());
        String listenKey = obj.getString("listenKey");
        logger.info("listenKey:" + listenKey);

        wsClient.listenUserStream(listenKey, ((event) -> {
            logger.info(event);
        }));
    }
}
