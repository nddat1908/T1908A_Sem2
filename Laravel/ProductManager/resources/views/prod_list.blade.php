<?php
$_SESSION['username'] = "Admin";
?>

    <!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>List Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900|Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    <link rel="stylesheet" href="{{URL::asset('css/style.css')}}">
</head>
<body>
<main>
    <section class="gallery-links">
        <div class="wrapper">
            <h2 style="padding-top: 50px;">List Product</h2>
            <div class="gallery-container">
                <?php
                $servername = "localhost";
                $username = "root";
                $password = "";
                $dbname = "product_manager";

                $conn = mysqli_connect($servername, $username, $password, $dbname);
                $sql = "SELECT * FROM products";
                $stmt = mysqli_stmt_init($conn);
                if (!mysqli_stmt_prepare($stmt, $sql)) {
                    echo "SQL statement failed!";
                } else {
                    mysqli_stmt_execute($stmt);
                    $result = mysqli_stmt_get_result($stmt);
                    while ($row = mysqli_fetch_assoc($result)) {
                        echo '<a href="cases.html">
                <div class="cases-link">
                    <img width="236px" height="236px class ="cases-link" src="'.$row['img'].'">
                    <h3  class="cases-title" style="color: black">'.$row['product_name'].'</h3>
                    <p class="cases-desc" style="color: red">'.$row['price'].'đ</p>
                </div>
            </a>';
                    }
                }
                ?>
            </div>


        </div>
    </section>



</main>
</body>
</html>


