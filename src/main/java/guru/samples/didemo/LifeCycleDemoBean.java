package guru.samples.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## LifeCycleDemoBean - inside the constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## LifeCycleDemoBean - BeanFactory set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## LifeCycleDemoBean - bean name set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## LifeCycleDemoBean - terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## LifeCycleDemoBean - properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## LifeCycleDemoBean - ApplicationContext set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## LifeCycleDemoBean - @PostConstruct method call");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## LifeCycleDemoBean - @PreDestroy method call");
    }

    public void beforeInit() {
        System.out.println("## LifeCycleDemoBean - before init call by BeanPostProcessor");
    }

    public void afterInit() {
        System.out.println("## LifeCycleDemoBean - after init call by BeanPostProcessor");
    }
}