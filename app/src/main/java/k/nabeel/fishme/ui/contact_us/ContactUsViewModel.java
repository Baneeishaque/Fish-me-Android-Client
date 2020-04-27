package k.nabeel.fishme.ui.orders;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactUsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ContactUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is contact_us fragment");
    }


    public LiveData<String> getText() {
        return mText;
    }
}
// TODO: Implement the ViewModel

