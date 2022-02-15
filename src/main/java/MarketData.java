import com.binance.connector.client.impl.SpotClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

/**
 * Example on how to get market data - klines, aggTrades and trades.
 */

public class MarketData {
    private static final Logger logger = LoggerFactory.getLogger(MarketData.class);
    private static final SpotClientImpl client = new SpotClientImpl();

    public static void getKlines() {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");
        parameters.put("interval", "1m");

        String result = client.createMarket().klines(parameters);
        logger.info(result);
    }

    public static void getAggTrades() {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");

        String result = client.createMarket().aggTrades(parameters);
        logger.info(result);
    }

    public static void getTrades() {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");

        String result = client.createMarket().trades(parameters);
        logger.info(result);
    }

    public static void main(String[] args) {
        getKlines();
        getAggTrades();
        getTrades();
    }
}
