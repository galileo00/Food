package com.example.food.Base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

public class BaseActivity extends AppCompatActivity {


    protected AppCompatActivity activity;
    MaterialDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
    }


    public MaterialDialog showMessage(String title, String message, String positiveText) {


        dialog = new MaterialDialog.Builder(activity)
                .title(title)
                .positiveText(positiveText)
                .cancelable(false)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .content(message)
                .show();
        return dialog;
    }

    public MaterialDialog showMessage(int titleID, int messageID, int positiveTextID) {


        dialog = new MaterialDialog.Builder(activity)
                .title(titleID)
                .positiveText(positiveTextID)
                .cancelable(false)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .content(messageID)
                .show();

        return dialog;
    }

    public MaterialDialog showConfirmationMessage(String title, String message, String positiveText, MaterialDialog.SingleButtonCallback onPositiveAction) {


        dialog = new MaterialDialog.Builder(activity)
                .title(title)
                .positiveText(positiveText)
                .onPositive(onPositiveAction)
                .canceledOnTouchOutside(false)
                .content(message)
                .show();
        return dialog;
    }

    public MaterialDialog showConfirmationMessage(int titleID, int messageID, int positiveTextID, MaterialDialog.SingleButtonCallback onPositiveAction) {


        dialog = new MaterialDialog.Builder(activity)
                .title(titleID)
                .positiveText(positiveTextID)
                .canceledOnTouchOutside(false)
                .onPositive(onPositiveAction)
                .content(messageID)
                .show();

        return dialog;
    }


    public MaterialDialog showYesNoMessage(String title, String message, String positiveText, MaterialDialog.SingleButtonCallback onPositiveAction, String negative, MaterialDialog.SingleButtonCallback onNegativeAction) {


        dialog = new MaterialDialog.Builder(activity)
                .title(title)
                .positiveText(positiveText)
                .onPositive(onPositiveAction)
                .negativeText(negative)
                .onNegative(onNegativeAction)
                .content(message)
                .show();
        return dialog;
    }

    public MaterialDialog showYesNoMessage(int titleId, int messageId, int positiveTextId, MaterialDialog.SingleButtonCallback onPositiveAction, int negativeId, MaterialDialog.SingleButtonCallback onNegativeAction) {


        dialog = new MaterialDialog.Builder(activity)
                .title(titleId)
                .positiveText(positiveTextId)
                .onPositive(onPositiveAction)
                .negativeText(negativeId)
                .onNegative(onNegativeAction)
                .content(messageId)
                .show();
        return dialog;
    }


    public MaterialDialog showProgresBar() {

        dialog = new MaterialDialog.Builder(activity)
                .progress(true, 0)
                .cancelable(false)
                .show();
        return dialog;

    }

    public void hideDialog() {

        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }


}
