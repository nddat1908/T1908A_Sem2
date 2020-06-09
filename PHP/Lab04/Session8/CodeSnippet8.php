<?php
$x = 50;
$y = 5;
echo "\$x & \$y = ".($x & $y)."<br>";
echo "\$x | \$y = ".($x | $y)."<br>";
echo "\$x ^ \$y = ".($x ^ $y)."<br>";
echo "~(\$y) =".~$y."<br>";
//x is divided by 2 y times
echo "\$x >> \$y = ".($x >> $y)."<br>";
//x is multiplied by 2 y times
echo "\$x << \$y = ".($x << $y)."<br>";
//Converts the operands to their ASCII values first ('5'(ascii 53))^ ('9'(ascii 57))
echo "The Bitwise result of 5 ^ 9 is:".(5 ^ 9)."<br>";
//Converts "8" to perform the operation (5 ^ ((int)"8")
echo "The result of 5 ^ 8 is: ".(5 ^ 8)."<br>";
?>