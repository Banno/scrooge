//
// Automatically @generated by Scrooge
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
import Foundation
import TwitterApacheThrift
@objc(TESTSomeEnum)
public enum SomeEnum: Int32, ThriftCodable {
  case aaa = 1
  case bbb = 2

  public func thriftEncode(to encoder: ThriftEncoder) throws {
     var container = encoder.unkeyedContainer()
     try container.encode(self.rawValue)
  }

  public init(fromThrift decoder: ThriftDecoder) throws {
    var container = try decoder.unkeyedContainer()
    let value = try container.decode(Int32.self)
    guard let enumValue = SomeEnum(rawValue: value) else {
      throw ThriftDecoderError.undecodableType(type: value.self)
    }
    self = enumValue
  }

  public static func thriftType() -> ThriftType {
    return .int32
  }
}
