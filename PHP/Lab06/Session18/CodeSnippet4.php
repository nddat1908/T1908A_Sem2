<?php
$connect_mysql = mysqli_connect('localhost','root','','publication');
$result = mysqli_query($connect_mysql,'select * from customers');
$rows = $result->num_rows;
echo "The table contains $rows row.<br>";
mysqli_close($connect_mysql);
echo "The connection to the database has been closed.";
?>