package org.mic4j.framework.core.itf;

/**
 * 容器接口
 * 
 * @since 1.0.0
 * @version 1.0.0
 * @author MiceLife
 * @time 2016年6月15日 下午4:38:25
 */
public interface ApplicationContainer extends Container {
	/**
	 * 启动
	 */
	public void startup();

	/**
	 * 停止
	 */
	public void shutdown();
}
