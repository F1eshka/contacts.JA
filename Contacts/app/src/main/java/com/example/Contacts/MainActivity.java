package com.example.Contacts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecycler;
    private List<ChatItem> chatList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecycler = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        contactsRecycler.setLayoutManager(layoutManager);

        chatList = new ArrayList<>();

        chatList.add(new ChatItem("СБ", "Мама", "Заберешь меня сегодня? ", "14:15", "2"));
        chatList.add(new ChatItem("ШАГ", "IT Step Academy", "Оценки за практическую работу по Java", "12:30", "1"));
        chatList.add(new ChatItem("MS", "Mushlya Studio Team", "Скинула правки по макету в Figma...", "Вчера", "14"));
        chatList.add(new ChatItem("EX", "Step to exchange", "Тест анонимной транзакции успешен", "Вчера", "0"));
        chatList.add(new ChatItem("MC", "Minecraft Server", "Кто пойдет портал строить?", "Ср", "156"));
        chatList.add(new ChatItem("К", "Кот-Сфинкс Care", "Напоминание: заказать гипоаллергенный корм", "Пн", "1"));
        chatList.add(new ChatItem("SM", "Saved Messages", "Идеи для meal prep на массу", "12 Мар", "0"));

        ChatAdapter chatAdapter = new ChatAdapter(chatList);
        contactsRecycler.setAdapter(chatAdapter);
    }
}