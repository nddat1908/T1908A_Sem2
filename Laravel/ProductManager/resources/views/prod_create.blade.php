<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<form action = "{{url('create')}}" method = "post">
    <input type = "hidden" name = "_token" value = "<?php echo csrf_token(); ?>">
    <h2>Add Product</h2>
    <table style="    font-size: 20px;">
        <tr>
            <td>Name</td>
            <td><input type='text' name='product_name' /></td>
        <tr>
            <td>Price</td>
            <td><input type="text" name='price'/></td>
        </tr>

        <tr>
            <td>Img</td>
            <td><input type="text" name='img'/></td>
        </tr>
        </tr>
        <tr>
            <td colspan = '2'>
                <input type = 'submit' value = "Add product" style="border: none;border-radius: 10px;background-color: #ea88aa;font-size: 15px;padding: 10px;"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
