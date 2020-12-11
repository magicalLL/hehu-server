package cn.stylefeng.guns.modular.hhsys.model.params;

import lombok.Data;
import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author lls
 * @since 2020-11-17
 */
@Data
public class UrlsParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    private String id;

    private String name;

    private String url;

    @Override
    public String checkParam() {
        return null;
    }

}
