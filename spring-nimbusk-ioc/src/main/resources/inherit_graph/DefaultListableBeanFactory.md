classDiagram
direction BT
class AbstractAutowireCapableBeanFactory
class AbstractBeanFactory
class AliasRegistry {
<<Interface>>
}

class AutowireCapableBeanFactory {
<<Interface>>
}

class BeanDefinitionRegistry {
<<Interface>>
}

class BeanFactory {
<<Interface>>
}

class ConfigurableBeanFactory {
<<Interface>>
}

class ConfigurableListableBeanFactory {
<<Interface>>
}

class DefaultListableBeanFactory
class DefaultSingletonBeanRegistry
class FactoryBeanRegistrySupport
class HierarchicalBeanFactory {
<<Interface>>
}

class ListableBeanFactory {
<<Interface>>
}

class Serializable {
<<Interface>>
}

class SimpleAliasRegistry
class SingletonBeanRegistry {
<<Interface>>
}

class SuppressWarnings

AbstractAutowireCapableBeanFactory  -->  AbstractBeanFactory 
AbstractAutowireCapableBeanFactory  -->  AutowireCapableBeanFactory 
AbstractBeanFactory  -->  ConfigurableBeanFactory 
AbstractBeanFactory  -->  FactoryBeanRegistrySupport 
AutowireCapableBeanFactory  -->  BeanFactory 
BeanDefinitionRegistry  -->  AliasRegistry 
ConfigurableBeanFactory  -->  HierarchicalBeanFactory 
ConfigurableBeanFactory  -->  SingletonBeanRegistry 
ConfigurableListableBeanFactory  -->  AutowireCapableBeanFactory 
ConfigurableListableBeanFactory  -->  ConfigurableBeanFactory 
ConfigurableListableBeanFactory  -->  ListableBeanFactory 
DefaultListableBeanFactory  -->  AbstractAutowireCapableBeanFactory 
DefaultListableBeanFactory  -->  BeanDefinitionRegistry 
DefaultListableBeanFactory  -->  ConfigurableListableBeanFactory 
DefaultListableBeanFactory  -->  Serializable 
SuppressWarnings  --  DefaultListableBeanFactory 
DefaultSingletonBeanRegistry  -->  SimpleAliasRegistry 
DefaultSingletonBeanRegistry  ..>  SingletonBeanRegistry 
FactoryBeanRegistrySupport  -->  DefaultSingletonBeanRegistry 
HierarchicalBeanFactory  -->  BeanFactory 
ListableBeanFactory  -->  BeanFactory 
SimpleAliasRegistry  ..>  AliasRegistry 
