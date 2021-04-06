package com.example.firebaserealtimedatabase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Person");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Gửi dữ liệu
        //1: kiểu String

//        myRef.child("Android24112020").setValue("10 bạn").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if(task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thêm dữ liệu thành công", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(MainActivity.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


        //2: kiểu object
        //phuong tien
        //name : xe dap
        //sobanh : 2 bánh
//        Phuongtien xedap = new Phuongtien("xe đạp", 2);
//        myRef.child("Phuongtien").setValue(xedap).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if(task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thêm dữ liệu thành công", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(MainActivity.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //3: kiểu list object

        //Message
        //asdasd2146465-65465464sss : random id
        //text : " xin chào"
        //time: "02042021"

//        myRef.child("Message")
//                .push()
//                .setValue(new chatMessage("How are you?", System.currentTimeMillis()))
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        if(task.isSuccessful()){
//                            Toast.makeText(MainActivity.this, "Thêm dữ liệu thành công", Toast.LENGTH_SHORT).show();
//                        }
//                        else{
//                            Toast.makeText(MainActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });

        //Đọc dữ liệu
//        myRef.child("Android24112020").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                String value = (String) snapshot.getValue();
//
//                Toast.makeText(MainActivity.this,value, Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });

        //Đọc dạng object
//        myRef.child("Phuongtien").addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                HashMap<String,String> hashMap = (HashMap<String, String>) snapshot.getValue();
                // Log.d("BBBB",hashMap.toString());
//                Iterator iterator = hashMap.entrySet().iterator();//lấy từng thông tin ra
//
//                while(iterator.hasNext()){
//                    Map.Entry entry = (Map.Entry) iterator.next();
//                    Log.d("BBBB", entry.getKey().toString());
//                    Log.d("BBBB", entry.getValue().toString());
//                    iterator.remove();//lấy từng thông tin ra
//                }
//                Phuongtien phuongtien = snapshot.getValue(Phuongtien.class);
//                Toast.makeText(MainActivity.this, phuongtien.toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });

        //Đọc dữ liệu dạng list
        myRef.child("Message").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                chatMessage message = snapshot.getValue(chatMessage.class);
                Toast.makeText(MainActivity.this, message.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }
}
