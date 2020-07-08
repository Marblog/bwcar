package cn.marblog.bwcar.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author PC
 */
@Setter
@Getter
public class QueryDtO {
    private int offset;
    private int limit;
    private String order;
    private String sort;
    private String search;


}
