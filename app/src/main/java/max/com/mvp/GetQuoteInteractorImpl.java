package max.com.mvp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Maxim on 12/31/2017.
 */

public class GetQuoteInteractorImpl implements GetQuoteInteractor {

    private List arrayList = Arrays.asList(
            "Вот так",
            "Работает",
            "MVP",
            "pattern",
            "и это круто!"
    );

    @Override
    public void getNextQuote(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }

    private String getRandomString() {

        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        return (String) arrayList.get(index);
    }
}
