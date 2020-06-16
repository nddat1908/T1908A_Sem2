<?php
$server = 'localhost';
$username = 'root';
$password = '';
$connect_mysql = mysqli_connect($server, $username, $password);
if ($connect_mysql)
{
    echo "Connection established<br>";
}
else
{
    die("Unable to connect<br>");
}
$mysql_db = mysqli_select_db($connect_mysql,'publication');

if ($mysql_db)
{
    echo "Connection to the database<br>";
}
else
{
    die("Unable to connect to the database<br>");
}
$sql_delete = "DELETE FROM user_contact WHERE user_id ='101'";
$result= mysqli_query($connect_mysql, $sql_delete);
if ($result)
{
    echo "Records Deleted: $result<br>";
}
else
{
    echo "RECORDS NOT FOUND IN THE TABLE<BR>";
    printf("Error message: %s\n",mysqli_error($connect_mysql));
}
?>