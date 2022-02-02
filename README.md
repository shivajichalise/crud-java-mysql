# Simple CRUD application using Java and MySQL

##### Want to test this out ?

1. Clone this repo
2. Edit `DB.java` and add your credentials (Database name, database username & database password)
3. Compile

```sh
  javac Main.java
```

4. Execute

```sh
# If on Linux
java -cp :./utils/mysql-connector-java-8.0.28.jar Main.java
```

> If you want to run this without modifying the code you need to have a table named 'users' in your databse and have 3 columns (id int, name varchar() and age int) in that table.
