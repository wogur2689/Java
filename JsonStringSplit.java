// Json문자열 값만 출력하는 코드
        String str = post(uri.toString(), test.toString());
        str = str.substring(str.indexOf("{")+1, str.lastIndexOf("}"));
        String data[] = str.split(",");

        for(int i = 0; i < data.length; i++) {
            data[i] = data[i].substring(data[i].indexOf(":")+1);
            System.out.println(data[i]);
        }
