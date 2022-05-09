import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.EditText
import androidx.annotation.Nullable
import androidx.fragment.app.DialogFragment
import com.example.projet.Niveau2Activity
import com.example.projet.R

// ...
class EndgameFragment: DialogFragment() {
    private var mEditText: EditText? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.endgame, container)
    }


    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Get field from view
        mEditText = view.findViewById(R.id.txt_your_name)
        // Fetch arguments from bundle and set title
        val title = requireArguments().getString("title", "Enter Name")
        dialog!!.setTitle(title)
        // Show soft keyboard automatically and request focus to field
        mEditText!!.requestFocus()
        dialog!!.window!!.setSoftInputMode(
            WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE
        )
    }

    companion object {
        fun newInstance(title: String?): EndgameFragment {
            val frag = EndgameFragment()
            val args = Bundle()
            args.putString("title", title)
            frag.arguments = args
            return frag
        }
    }
}