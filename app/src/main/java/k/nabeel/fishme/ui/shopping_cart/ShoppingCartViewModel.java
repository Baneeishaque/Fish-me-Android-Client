package k.nabeel.fishme.ui.orders;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShoppingCartViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ShoppingCartViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is shopping_cart fragment");
    }


    public LiveData<String> getText() {
        return mText;
    }
}
// TODO: Implement the ViewModel

