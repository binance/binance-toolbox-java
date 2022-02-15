import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.spot.Market;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GetExchangeInfo {
    private static final Logger logger = LoggerFactory.getLogger(GetExchangeInfo.class);
    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl();
        Market market = client.createMarket();
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        //Get all symbols
        String result = market.exchangeInfo(parameters);
        logger.info(result);

        //Get a single symbol
        parameters.put("symbol","BTCUSDT");
        result = market.exchangeInfo(parameters);
        logger.info(result);
        parameters.clear();

        //Get multiple symbols
        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("BTCUSDT");
        symbols.add("BNBUSDT");
        parameters.put("symbols", symbols);
        result = market.exchangeInfo(parameters);
        logger.info(result);
    }
}
