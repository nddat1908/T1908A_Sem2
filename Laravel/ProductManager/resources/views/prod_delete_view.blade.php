<!Doctype html>
<html>
<head>
    <title>Delete Product</title>
</head>
<body style="background-color:#9e9e9e1c;">


<h2>Edit/Delete Product</h2>
<table border = "1" style="font-size: 20px;background-color: white;">
    <tr>
        <td style="padding: 15px;">ID</td>
        <td style="padding: 15px;">Product Name</td>
        <td style="padding: 15px;">Price</td>
        <td style="padding: 15px;">Img</td>
        <td style="padding: 15px;">Edit</td>
        <td style="padding: 15px;">Delete</td>
    </tr>
    @foreach ($users as $user)
        <tr>
            <td style="padding: 15px;">{{ $user->id }}</td>
            <td style="padding: 15px;">{{ $user->product_name }}</td>
            <td style="padding: 15px;">{{ $user->price}}</td>
            <td style="padding: 15px;">{{ $user->img }}</td>
            <td style="padding: 15px;"><a href = 'edit/{{ $user->id }}'>Edit</a></td>
            <td style="padding: 15px;"><a href = 'delete/{{ $user->id }}'>Delete</a></td>
        </tr>
    @endforeach
</table>
</body>
</html>
