package com.example.food.Base;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.afollestad.materialdialogs.MaterialDialog;

public class BaseFragment extends Fragment {


    protected BaseActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = ((BaseActivity) context);
    }


    public MaterialDialog showMessage(String title, String message, String positiveText) {


        return activity.showMessage(title, message, positiveText);
    }

    public MaterialDialog showMessage(int titleID, int messageID, int positiveTextID) {


        return activity.showMessage(titleID, messageID, positiveTextID);
    }

    public MaterialDialog showConfirmationMessage(String title, String message, String positiveText, MaterialDialog.SingleButtonCallback onPositiveAction) {


        return activity.showConfirmationMessage(title, message, positiveText, onPositiveAction);
    }

    public MaterialDialog showConfirmationMessage(int titleID, int messageID, int positiveTextID, MaterialDialog.SingleButtonCallback onPositiveAction) {


        return activity.showConfirmationMessage(titleID, messageID, positiveTextID, onPositiveAction);
    }


    public MaterialDialog showYesNoMessage(String title, String message, String positiveText, MaterialDialog.SingleButtonCallback onPositiveAction, String negative, MaterialDialog.SingleButtonCallback onNegativeAction) {


        return activity.showYesNoMessage(title, message, positiveText, onPositiveAction, negative, onNegativeAction);
    }

    public MaterialDialog showYesNoMessage(int titleId, int messageId, int positiveTextId, MaterialDialog.SingleButtonCallback onPositiveAction, int negativeId, MaterialDialog.SingleButtonCallback onNegativeAction) {


        return activity.showYesNoMessage(titleId, messageId, positiveTextId, onPositiveAction, negativeId, onNegativeAction);
    }


    public MaterialDialog showProgresBar() {


        return activity.showProgresBar();

    }

    public void hideDialog() {

        activity.hideDialog();
    }


}
