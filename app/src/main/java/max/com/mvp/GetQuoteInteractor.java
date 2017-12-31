package max.com.mvp;

/**
 * Created by Maxim on 12/31/2017.
 */

public interface GetQuoteInteractor {

    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
