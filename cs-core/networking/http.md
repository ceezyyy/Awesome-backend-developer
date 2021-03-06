# HTTP

## Table of Contents
- [1. Web 基础](#1-web-基础)
	- [1.1 报文](#11-报文)
	- [1.2 连接](#12-连接)
		- [1.2.1 并行连接](#121-并行连接)
		- [1.2.2 持久化连接](#122-持久化连接)
- [References](#references)

## 1. Web 基础

### 1.1 报文

- 起始行
  - 请求行
    - 方法
    - *URL*
  - 响应行
    - *HTTP* 版本
    - 数字状态码
    - 描述短语
- 首部
  - 通用首部
  - 请求首部
  - 响应首部
  - 实体首部
  - 扩展首部
- 主体

### 1.2 连接

> 世界上几乎所有的 *http* 通信都是由 *tcp/ip* 承载的

#### 1.2.1 并行连接

**pros**

- 多条连接，并行执行多个 *http* 事务

**cons**

- 对客户端带宽有要求
- 大量连接会消耗服务器内存资源

#### 1.2.2 持久化连接






## References

- *HTTP: The Definitive Guide*

