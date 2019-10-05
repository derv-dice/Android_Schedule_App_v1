package com.example.mark_5;

public class ScheduleItem {
    private String Object_Id;               // Уникальный идентификатор элемента
    private String Time0;                   // Время начала пары
    private String Time1;                   // Время окончания пары
    private String Item_Name;               // Название предмета
    private String Teacher_Name;            // Имя преподавателя
    private String Item_Mode;               // Лекция, Практика и т.д.
    private String Item_Auditorium;         // Аудитория
    private String Item_Building;           // Корпус

    private String Teacher_Phone;           // Номер телефона преподавателя
    private String Teacher_Mail;            // Электронная почта преподавателя
    private String Favourite;               // Содержится ли предмет в избранном

    ScheduleItem(String _Id, String _time0, String _time1, String _Item_Name,
                 String _Teacher_name, String _Item_Mode, String _Item_Auditorium,
                 String _Item_Building, String _Teacher_Phone, String _Teacher_Mail,
                 String _Favourite){

        Object_Id = _Id;
        Time0 = _time0;
        Time1 = _time1;
        Item_Name = _Item_Name;
        Teacher_Name = _Teacher_name;
        Item_Mode = _Item_Mode;
        Item_Auditorium = _Item_Auditorium;
        Item_Building = _Item_Building;

        Teacher_Phone = _Teacher_Phone;
        Teacher_Mail = _Teacher_Mail;
        Favourite = _Favourite;
    }

    public boolean Is_Favourite(){
        if (Favourite.equals("0")){
            return false;
        }
        else{
            return true;
        }
    }

    // Блок методов get()
    public String getObject_Id () {
        return Object_Id;
    }
    public String getItem_Name () {
        return Item_Name;
    }
    public String getTime0 () {
        return Time0;
    }
    public String getItem_Mode () {
        return Item_Mode;
    }
    public String getTime1 () {
        return Time1;
    }
    public String getTeacher_Name () {
        return Teacher_Name;
    }
    public String getItem_Auditorium () {
        return Item_Auditorium;
    }
    public String getItem_Building () {
        return Item_Building;
    }
    public String getTeacher_Phone () {
        return Teacher_Phone;
    }
    public String getTeacher_Mail () {
        return Teacher_Mail;
    }
    public String getFavourite () {
        return Favourite;
    }
}
