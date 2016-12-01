package example.fragmenty1;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    //onCreateView() is called by Android once the Fragment should inflate a view.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;
    }

    public void setText(String txt) {
        TextView view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(txt);
    }
}
