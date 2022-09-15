package cn.iocoder.yudao.module.product.convert.spu;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.product.api.spu.dto.SpuInfoRespDTO;
import cn.iocoder.yudao.module.product.controller.admin.spu.vo.*;
import cn.iocoder.yudao.module.product.controller.app.spu.vo.AppSpuPageReqVO;
import cn.iocoder.yudao.module.product.controller.app.spu.vo.AppSpuPageRespVO;
import cn.iocoder.yudao.module.product.dal.dataobject.spu.ProductSpuDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 商品spu Convert
 *
 * @author 芋道源码
 */
@Mapper
public interface ProductSpuConvert {

    ProductSpuConvert INSTANCE = Mappers.getMapper(ProductSpuConvert.class);

    ProductSpuDO convert(ProductSpuCreateReqVO bean);

    ProductSpuDO convert(ProductSpuUpdateReqVO bean);

    SpuRespVO convert(ProductSpuDO bean);

    List<SpuRespVO> convertList(List<ProductSpuDO> list);

    PageResult<SpuRespVO> convertPage(PageResult<ProductSpuDO> page);

    SpuPageReqVO convert(AppSpuPageReqVO bean);

    AppSpuPageRespVO convertAppResp(ProductSpuDO list);

    List<SpuInfoRespDTO> convertList2(List<ProductSpuDO> list);


}
