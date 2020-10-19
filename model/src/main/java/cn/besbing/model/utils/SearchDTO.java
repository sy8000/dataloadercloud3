package cn.besbing.model.utils;

/**
 * Xiamen HLYY Network Technology Co., Ltd.
 * DataLoader Cloud
 *
 * @Author sheny
 * @Date 2020/10/16  14:24
 * @Version 1.0
 * @Site https://besbing.cn
 * @Address Xiamen Bazaar U.S. District, 326 South Road, A Dong A209.
 */
public class SearchDTO {


    private Integer page;

    private Integer limit;

    private String keyword;

    private String parentId;

    private Integer type;



    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getKeyword() {
        return keyword;
    }

    public SearchDTO(Integer page, Integer limit, String keyword) {
        super();
        this.page = page;
        this.limit = limit;
        this.keyword = keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public SearchDTO(Integer page, Integer limit, String keyword, String parentId, Integer type) {
        super();
        this.page = page;
        this.limit = limit;
        this.keyword = keyword;
        this.parentId = parentId;
        this.type = type;
    }

}
