// automatically generated by the FlatBuffers compiler, do not modify

package org.mydotey.codec.benchmark.data.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MultiStringData extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_11_1(); }
  public static MultiStringData getRootAsMultiStringData(ByteBuffer _bb) { return getRootAsMultiStringData(_bb, new MultiStringData()); }
  public static MultiStringData getRootAsMultiStringData(ByteBuffer _bb, MultiStringData obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MultiStringData __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String fString1() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString1AsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer fString1InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String fString2() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString2AsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer fString2InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String fString3() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString3AsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer fString3InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String fString4() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString4AsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer fString4InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public String fString5() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString5AsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer fString5InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public String fString6() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString6AsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer fString6InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }
  public String fString7() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString7AsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer fString7InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }
  public String fString8() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString8AsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer fString8InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }
  public String fString9() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString9AsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public ByteBuffer fString9InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 1); }
  public String fString10() { int o = __offset(22); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fString10AsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public ByteBuffer fString10InByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 22, 1); }

  public static int createMultiStringData(FlatBufferBuilder builder,
      int fString1Offset,
      int fString2Offset,
      int fString3Offset,
      int fString4Offset,
      int fString5Offset,
      int fString6Offset,
      int fString7Offset,
      int fString8Offset,
      int fString9Offset,
      int fString10Offset) {
    builder.startTable(10);
    MultiStringData.addFString10(builder, fString10Offset);
    MultiStringData.addFString9(builder, fString9Offset);
    MultiStringData.addFString8(builder, fString8Offset);
    MultiStringData.addFString7(builder, fString7Offset);
    MultiStringData.addFString6(builder, fString6Offset);
    MultiStringData.addFString5(builder, fString5Offset);
    MultiStringData.addFString4(builder, fString4Offset);
    MultiStringData.addFString3(builder, fString3Offset);
    MultiStringData.addFString2(builder, fString2Offset);
    MultiStringData.addFString1(builder, fString1Offset);
    return MultiStringData.endMultiStringData(builder);
  }

  public static void startMultiStringData(FlatBufferBuilder builder) { builder.startTable(10); }
  public static void addFString1(FlatBufferBuilder builder, int fString1Offset) { builder.addOffset(0, fString1Offset, 0); }
  public static void addFString2(FlatBufferBuilder builder, int fString2Offset) { builder.addOffset(1, fString2Offset, 0); }
  public static void addFString3(FlatBufferBuilder builder, int fString3Offset) { builder.addOffset(2, fString3Offset, 0); }
  public static void addFString4(FlatBufferBuilder builder, int fString4Offset) { builder.addOffset(3, fString4Offset, 0); }
  public static void addFString5(FlatBufferBuilder builder, int fString5Offset) { builder.addOffset(4, fString5Offset, 0); }
  public static void addFString6(FlatBufferBuilder builder, int fString6Offset) { builder.addOffset(5, fString6Offset, 0); }
  public static void addFString7(FlatBufferBuilder builder, int fString7Offset) { builder.addOffset(6, fString7Offset, 0); }
  public static void addFString8(FlatBufferBuilder builder, int fString8Offset) { builder.addOffset(7, fString8Offset, 0); }
  public static void addFString9(FlatBufferBuilder builder, int fString9Offset) { builder.addOffset(8, fString9Offset, 0); }
  public static void addFString10(FlatBufferBuilder builder, int fString10Offset) { builder.addOffset(9, fString10Offset, 0); }
  public static int endMultiStringData(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
}

