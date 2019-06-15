@RequestMapping("/showImage.do")
    public @ResponseBody
   void showImage(String path) throws IOException {
        getResponse().setContentType("text/jsp; charset=UTF-8");
        getResponse().setContentType("image/jpeg");
        String fullFileName = getRealPath("/upload/" + path);
        FileInputStream fis = new FileInputStream(fullFileName);
        OutputStream os = getResponse().getOutputStream();
        try {
            int count = 0;
            byte[] buffer = new byte[1024 * 1024];
            while ((count = fis.read(buffer)) != -1)
                os.write(buffer, 0, count);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null)
                os.close();
            if (fis != null)
                fis.close();
        }
}
