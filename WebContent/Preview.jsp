<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>预览图片</title>
<script type="text/javascript">
    function preview(path){
        var ext=path.split('.')[1];
        if(ext=="PNG"){
            window.open("<%=path%>/file/showImage.do?path="+path);
        }
    }
</script>
</head>
<body>
    <a href="##" onclick="preview('${file.filePath}')" >预览</a>
</body>
</html>