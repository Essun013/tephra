package org.lpw.tephra.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * IO操作工具集。
 *
 * @author lpw
 */
public interface Io {
    /**
     * 创建目录（集）。
     *
     * @param file 目录。
     */
    void mkdirs(File file);

    /**
     * 创建目录（集）。
     *
     * @param path 目录。
     */
    void mkdirs(String path);

    /**
     * 读取指定路径下的文件。
     *
     * @param path 文件所在路径。
     * @return 文件内容。如果读文件异常则返回null，如果文件为空则返回空字符串""。
     */
    byte[] read(String path);

    /**
     * 写入文件。
     *
     * @param path    文件所在路径。
     * @param content 文件内容。
     */
    void write(String path, byte[] content);

    /**
     * 复制文件。
     *
     * @param input  输入文件路径。
     * @param output 输出文件路径。
     */
    void copy(String input, String output);

    /**
     * 将输入流中的数据复制到输出流中。
     *
     * @param input  输入流。
     * @param output 输出流。
     * @throws IOException 未处理IO读写异常。
     */
    void copy(InputStream input, OutputStream output) throws IOException;

    /**
     * 将字符串输出到输出流中。
     *
     * @param output 输出流。
     * @param source 要输出的字符串。
     * @throws IOException 未处理IO读写异常。
     */
    void write(OutputStream output, StringBuffer source) throws IOException;

    /**
     * 移动文件。
     *
     * @param source 源文件。
     * @param target 目标文件。
     * @throws IOException 未处理IO读写异常。
     */
    void move(File source, File target) throws IOException;

    /**
     * 移动文件。
     *
     * @param source 源文件。
     * @param target 目标文件。
     * @throws IOException 未处理IO读写异常。
     */
    void move(String source, String target) throws IOException;

    /**
     * 删除文件/目录（递归）。
     *
     * @param file 文件/目录。
     */
    void delete(File file);

    /**
     * 删除文件/目录（递归）。
     *
     * @param path 文件/目录。
     */
    void delete(String path);
}
