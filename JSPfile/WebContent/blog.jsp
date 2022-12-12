<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TokBlog</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="articleBox">
        <div class="articleContent"></div>
    </div>

    <script type="text/javascript">
        let textBox = document.querySelector(".articleContent")
        let xmlhttp = new XMLHttpRequest();
        xmlhttp.open('GET', 'http://43.139.120.125:3001/article', true);
        xmlhttp.send();
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                console.log(JSON.parse(xmlhttp.response));
                let response = JSON.parse(xmlhttp.response);
                textBox.innerHTML = response[0].content
            }
        }
    </script>
</body>

</html>