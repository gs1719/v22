# v22
list view (basic)
```.xml
 <ListView
        android:id="@+id/listView"
        android:layout_width="390dp"
        android:layout_height="584dp"
        android:layout_marginStart="1dp"
        android:layout_marginEnd="1dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/textv" />

```

## for .kt file

```.kt
        val listView = findViewById<ListView>(R.id.listView)
        
        //datasource to connect to the listview with the help of the ADAPTER
        
        val taskList = arrayListOf<String>()

        taskList.add("Task1 .....")
        taskList.add("Task2 .....")
        taskList.add("Task3 .....")
        taskList.add("Task4 .....")
        taskList.add("Task5 .....")
        taskList.add("Task6 .....")

        val adapterForMyListView = ArrayAdapter(this  ,      android.R.layout.simple_list_item_checked  ,    taskList)
        //                          ^^^^^^^^^^^^             ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^              ^^^^^^^^^
        //                          ||||||||||||              |||||||||||||||||||||||||||||||                |||||||||
        //                 using inbuilt Adapter Class      using inbuilt simple layout for list view        Data Source
        
        /*
        * datasource(database here array)<--------- Adapter <--------- (View here Adapter)
        *
        * */
        
        //list view me data jor diya hai array adapter wala
        
        //|||||||||||||||||||
        //vvvvvvvvvvvvvvvvvvv
        listView.adapter = adapterForMyListView
```
