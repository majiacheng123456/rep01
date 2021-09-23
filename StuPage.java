package cn.zut.util;

public class StuPage {

    //当前页
    private Integer page = 1;

    //页大小
    private Integer rows = 5;

    //总记录数
    private Integer totalCount;

    //总页数
    private Integer totalPage;

    //开始记录位置
    private Integer start = 0;





    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return (totalCount - 1)/rows + 1;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getStart() {
        return (page - 1)*rows;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

}
