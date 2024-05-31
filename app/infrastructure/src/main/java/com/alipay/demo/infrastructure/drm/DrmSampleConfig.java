package com.alipay.demo.infrastructure.drm;

import com.alipay.drm.client.api.annotation.DAttribute;
import com.alipay.drm.client.api.annotation.DResource;
import com.alipay.sofa.specs.annotation.drm.DrmAttributeSpec;
import com.alipay.sofa.specs.annotation.drm.DrmResourceSpec;
import org.springframework.stereotype.Component;

/**
 * DRM快速入门文档：https://yuque.antfin-inc.com/docs/share/3970f07f-a196-47c4-b926-aa5432b9ccd1?# 《配置注解化快速入门》
 */
@Component
@DResource(id = "com.drmdemo.config")
@DrmResourceSpec(name = "DRM测试资源类")
public class DrmSampleConfig {

    /**
     * 定义一个 drm 属性，drm 属性 必须有对应的 setter、getter 方法，建议用 idea 自动生成的方式，不要手工写 setter、getter方法
     * 另外 drm 属性不能是静态属性，也就是不能是 static 属性，否则失效
     */
    @DAttribute
    @DrmAttributeSpec(name = "DRM测试资源属性")
    private String greetingWord;

    /**
     * 属性对应的 getter 方法，drm 页面 "服务端列表" 中显示的值是调用此 getter 方法返回的值
     */
    public String getGreetingWord() {
        return greetingWord;
    }

    /**
     * 属性对应的 setter 方法，每次从 drm 服务端获取到属性值都会回调此方法来更新 bean 属性值。
     * 业务需要在属性值变更时，做一些回调方法，就在此方法中执行。
     * 注意：setter 方法不宜做耗时很长（超过3s）的操作，否则会导致 setter 方法一直重试调用，最佳实践是耗时长的操作单读开启一个线程执行。
     *
     * @param greetingWord 最新的属性值
     */
    public void setGreetingWord(String greetingWord) {
        this.greetingWord = greetingWord;
    }
}
