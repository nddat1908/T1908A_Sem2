<!DOCTYPE html>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h2>Update Product</h2>
<form action = "/ProductManager/public/edit/<?php echo $users[0]->id; ?>" method = "post">
    <input type = "hidden" name = "_token" value = "<?php echo csrf_token(); ?>">
    <table style="    font-size: 20px;">
        <tr>
            <td>Product Name</td>
            <td>
                <input type = 'text' name = 'product_name'
                       value = '<?php echo$users[0]->product_name; ?>'/> </td>
        </tr>
        <tr>
            <td>Price</td>
            <td>
                <input type = 'text' name = 'price'
                       value = '<?php echo$users[0]->price; ?>'/>
            </td>
        </tr>

        <tr>
            <td>Img</td>
            <td>
                <input type = 'text' name = 'img'
                       value = '<?php echo$users[0]->img; ?>'/>
            </td>
        </tr>
        <tr>
            <td colspan = '2'>
                <input type = 'submit' value = "Update product"style="border: none;border-radius: 10px;background-color: #ea88aa;font-size: 15px;padding: 10px;" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
