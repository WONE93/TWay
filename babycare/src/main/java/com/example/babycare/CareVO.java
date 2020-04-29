package com.example.babycare;

public class CareVO {
    private Integer idx;
    private String M_date;
    private String S_date;
    private String M_MEMO;
    private String S_MEMO;
    private String M_SIZE;
    private String S_SIZE;
    private Integer BABY_NUM;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getM_date() {
        return M_date;
    }

    public void setM_date(String m_date) {
        M_date = m_date;
    }

    public String getS_date() {
        return S_date;
    }

    public void setS_date(String s_date) {
        S_date = s_date;
    }

    public String getM_MEMO() {
        return M_MEMO;
    }

    public void setM_MEMO(String m_MEMO) {
        M_MEMO = m_MEMO;
    }

    public String getS_MEMO() {
        return S_MEMO;
    }

    public void setS_MEMO(String s_MEMO) {
        S_MEMO = s_MEMO;
    }

    public String getM_SIZE() {
        return M_SIZE;
    }

    public void setM_SIZE(String m_SIZE) {
        M_SIZE = m_SIZE;
    }

    public String getS_SIZE() {
        return S_SIZE;
    }

    public void setS_SIZE(String s_SIZE) {
        S_SIZE = s_SIZE;
    }

    public Integer getBABY_NUM() {
        return BABY_NUM;
    }

    public void setBABY_NUM(Integer BABY_NUM) {
        this.BABY_NUM = BABY_NUM;
    }
}
