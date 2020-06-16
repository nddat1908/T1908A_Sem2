<?php
$server = 'localhost';
$username = 'root';
$password = '';
$connect_mysql = mysqli_connect($server,$username,$password);
if ($connect_mysql)
{
    echo "Connection established.";
}
else
{
    die("Unable to connect");
}
$db = "publication";
$mysql_db = mysqli_select_db($connect_mysql, $db);
if ($mysql_db)
{
    echo "<br><br>Connected to the database.";
}
else
{
    die("Unable to connect to the database");
}
$sql_insert = "INSERT INTO user_contact (USER_ID, USER_NAME,USER_EMAIL_ID) 
VALUES (101,'John','john@gmail.com')";
$result = mysqli_query($connect_mysql, $sql_insert);
if ($result)
{
    echo "<br><br>The records have been added to the table.";
}
else
{
    echo "Unable to insert records.";
    mysqli_error();
}
?>