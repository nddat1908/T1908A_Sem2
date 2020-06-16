<?php
$dbname = 'mysql';
if (!mysqli_connect('localhost','root',''))
{
    echo 'Could not connect to mysql';
}
$sql = "SHOW TABLES FROM $dbname";
$connect_mysql = mysqli_connect('localhost','root','');
$result = mysqli_query($connect_mysql, $sql);
if (!$result)
    $result = mysqli_query($sql);
echo "The tables from the database are: <br><br>";
if (!$result)
{
    echo "DB Erro, Unable to list tables<br>";
    echo 'MySQL Erro: ' . mysqli_error();
    exit;
}
while ($row = mysqli_fetch_row($result))
{
    echo "Table: {$row[0]}<br>";
}
?>