package com.example.mohsal.mysuperapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CodeVerify extends AppCompatActivity {

    String realVerifyCode="1398";
    EditText enteredVerifyCode;
    Button acceptCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_verify);
        enteredVerifyCode=findViewById(R.id.verifycode);
        acceptCode=findViewById(R.id.acceptCode);

        acceptCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(enteredVerifyCode.getText().toString()==realVerifyCode){
                if (enteredVerifyCode.getText().toString().equals("")) {
                    enteredVerifyCode.setError("کد را وارد کنید");
                    return;
                }
                //save(enteredVerifyCode.getText().toString());
                    MainActivity m=new MainActivity(true);
                    Intent intent=new Intent(CodeVerify.this,MainActivity.class);
                    startActivity(intent);

            }
        });

    }

//    @Override
//    protected void attachBaseContext(Context newBase) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
//    }
//
//    void save(String code) {
//        Send("http://madresetavangari.ir/singupemail/" + code);
//    }
//
//    private ProgressDialog pDialog;
//
//    void Send(final String URL) {
//
//        pDialog = new ProgressDialog(CodeVerify.this);
//        // Showing progress dialog before making http request
//        pDialog.setMessage("منتظر تایید بمانید");
//        pDialog.show();
//
//        // Tag used to cancel the request
//        String tag_string_req = "req_login";
//
//        StringRequest strReq = new StringRequest(Request.Method.GET,
//                URL, new Response.Listener<String>() {
//
//            @Override
//            public void onResponse(String response) {
//                Log.d("tag", "Login Response: " + response.toString());
//                pDialog.dismiss();
//                try {
//                    JSONObject jObj = new JSONObject(response);
//
//                    if (response.contains("id")) {
//
//                        String code = jObj.getString("id");
//                        tran(code);
////                        finish();
//                    } else {
//                        // Error in login. Get the error message
//                        Toast.makeText(getApplicationContext(),
//                                "کد وارد شده اشتباه است", Toast.LENGTH_LONG).show();
//                    }
//                } catch (JSONException e) {
//                    // JSON error
//                    e.printStackTrace();
//                    Toast.makeText(getApplicationContext(), "Json error: " + e.getMessage(), Toast.LENGTH_LONG).show();
//                }
//
//            }
//        }, new Response.ErrorListener() {
//
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("tag", "Login Error: " + error.getMessage());
//                pDialog.dismiss();
//                Toast.makeText(getApplicationContext(),
//                        error.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        });
//
//        // Adding request to request queue
//        AppController.getInstance().addToRequestQueue(strReq, tag_string_req);
//    }
//
//
//    private void hidePDialog() {
//        if (pDialog != null) {
//            pDialog.dismiss();
//            pDialog = null;
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        hidePDialog();
//        super.onDestroy();
//    }
//
//    void tt(String msg) {
//        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
//    }
//
//    void tran(String phn) {
//        hidePDialog();
//        SaveMe(phn);
//        SaveAccess();
//        Intent i = new Intent(CodeVerify.this, MainActivity.class);
////        i.putExtra("phn", phn);
//        startActivity(i);
//        this.finish();
//    }
//
//    void SaveMe(String user) {
//
//        File root = getFilesDir();
//        File dir = new File(root.getAbsolutePath() + "/.richmans");
//        dir.mkdirs();
//        File file = new File(dir, "phn.txt");
//
//        try {
//            FileOutputStream f = new FileOutputStream(file);
//            PrintWriter pw = new PrintWriter(f);
//            pw.println(user);
//            pw.flush();
//            pw.close();
//            f.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            //tt(e.getMessage());
//        } catch (IOException e) {
//            e.printStackTrace();
//            //tt(e.getMessage());
//        }
//
//    }
//
//    void SaveAccess() {
//
//        File root = getFilesDir();
//        File dir = new File(root.getAbsolutePath() + "/.richmans");
//        dir.mkdirs();
//        File file = new File(dir, "acc.txt");
//
//        try {
//            FileOutputStream f = new FileOutputStream(file);
//            PrintWriter pw = new PrintWriter(f);
//            pw.println("BRONZE");
//            pw.flush();
//            pw.close();
//            f.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            //tt(e.getMessage());
//        } catch (IOException e) {
//            e.printStackTrace();
//            //tt(e.getMessage());
//        }
//
//    }
}

