// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: stat_bonuses.proto
// Protobuf C++ Version: 5.27.3

#ifndef GOOGLE_PROTOBUF_INCLUDED_stat_5fbonuses_2eproto_2epb_2eh
#define GOOGLE_PROTOBUF_INCLUDED_stat_5fbonuses_2eproto_2epb_2eh

#include <limits>
#include <string>
#include <type_traits>
#include <utility>

#include "google/protobuf/runtime_version.h"
#if PROTOBUF_VERSION != 5027003
#error "Protobuf C++ gencode is built with an incompatible version of"
#error "Protobuf C++ headers/runtime. See"
#error "https://protobuf.dev/support/cross-version-runtime-guarantee/#cpp"
#endif
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/arena.h"
#include "google/protobuf/arenastring.h"
#include "google/protobuf/generated_message_tctable_decl.h"
#include "google/protobuf/generated_message_util.h"
#include "google/protobuf/metadata_lite.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/message.h"
#include "google/protobuf/repeated_field.h"  // IWYU pragma: export
#include "google/protobuf/extension_set.h"  // IWYU pragma: export
#include "google/protobuf/unknown_field_set.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"

#define PROTOBUF_INTERNAL_EXPORT_stat_5fbonuses_2eproto

namespace google {
namespace protobuf {
namespace internal {
class AnyMetadata;
}  // namespace internal
}  // namespace protobuf
}  // namespace google

// Internal implementation detail -- do not use these members.
struct TableStruct_stat_5fbonuses_2eproto {
  static const ::uint32_t offsets[];
};
extern const ::google::protobuf::internal::DescriptorTable
    descriptor_table_stat_5fbonuses_2eproto;
namespace github {
namespace nkibler7 {
namespace osrswikiscraper {
class StatBonuses;
struct StatBonusesDefaultTypeInternal;
extern StatBonusesDefaultTypeInternal _StatBonuses_default_instance_;
}  // namespace osrswikiscraper
}  // namespace nkibler7
}  // namespace github
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google

namespace github {
namespace nkibler7 {
namespace osrswikiscraper {

// ===================================================================


// -------------------------------------------------------------------

class StatBonuses final : public ::google::protobuf::Message
/* @@protoc_insertion_point(class_definition:github.nkibler7.osrswikiscraper.StatBonuses) */ {
 public:
  inline StatBonuses() : StatBonuses(nullptr) {}
  ~StatBonuses() override;
  template <typename = void>
  explicit PROTOBUF_CONSTEXPR StatBonuses(
      ::google::protobuf::internal::ConstantInitialized);

  inline StatBonuses(const StatBonuses& from) : StatBonuses(nullptr, from) {}
  inline StatBonuses(StatBonuses&& from) noexcept
      : StatBonuses(nullptr, std::move(from)) {}
  inline StatBonuses& operator=(const StatBonuses& from) {
    CopyFrom(from);
    return *this;
  }
  inline StatBonuses& operator=(StatBonuses&& from) noexcept {
    if (this == &from) return *this;
    if (GetArena() == from.GetArena()
#ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetArena() != nullptr
#endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  inline const ::google::protobuf::UnknownFieldSet& unknown_fields() const
      ABSL_ATTRIBUTE_LIFETIME_BOUND {
    return _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance);
  }
  inline ::google::protobuf::UnknownFieldSet* mutable_unknown_fields()
      ABSL_ATTRIBUTE_LIFETIME_BOUND {
    return _internal_metadata_.mutable_unknown_fields<::google::protobuf::UnknownFieldSet>();
  }

  static const ::google::protobuf::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::google::protobuf::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::google::protobuf::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const StatBonuses& default_instance() {
    return *internal_default_instance();
  }
  static inline const StatBonuses* internal_default_instance() {
    return reinterpret_cast<const StatBonuses*>(
        &_StatBonuses_default_instance_);
  }
  static constexpr int kIndexInFileMessages = 0;
  friend void swap(StatBonuses& a, StatBonuses& b) { a.Swap(&b); }
  inline void Swap(StatBonuses* other) {
    if (other == this) return;
#ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetArena() != nullptr && GetArena() == other->GetArena()) {
#else   // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetArena() == other->GetArena()) {
#endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::google::protobuf::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(StatBonuses* other) {
    if (other == this) return;
    ABSL_DCHECK(GetArena() == other->GetArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  StatBonuses* New(::google::protobuf::Arena* arena = nullptr) const final {
    return ::google::protobuf::Message::DefaultConstruct<StatBonuses>(arena);
  }
  using ::google::protobuf::Message::CopyFrom;
  void CopyFrom(const StatBonuses& from);
  using ::google::protobuf::Message::MergeFrom;
  void MergeFrom(const StatBonuses& from) { StatBonuses::MergeImpl(*this, from); }

  private:
  static void MergeImpl(
      ::google::protobuf::MessageLite& to_msg,
      const ::google::protobuf::MessageLite& from_msg);

  public:
  bool IsInitialized() const {
    return true;
  }
  ABSL_ATTRIBUTE_REINITIALIZES void Clear() final;
  ::size_t ByteSizeLong() const final;
  ::uint8_t* _InternalSerialize(
      ::uint8_t* target,
      ::google::protobuf::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const { return _impl_._cached_size_.Get(); }

  private:
  void SharedCtor(::google::protobuf::Arena* arena);
  void SharedDtor();
  void InternalSwap(StatBonuses* other);
 private:
  friend class ::google::protobuf::internal::AnyMetadata;
  static ::absl::string_view FullMessageName() { return "github.nkibler7.osrswikiscraper.StatBonuses"; }

 protected:
  explicit StatBonuses(::google::protobuf::Arena* arena);
  StatBonuses(::google::protobuf::Arena* arena, const StatBonuses& from);
  StatBonuses(::google::protobuf::Arena* arena, StatBonuses&& from) noexcept
      : StatBonuses(arena) {
    *this = ::std::move(from);
  }
  const ::google::protobuf::Message::ClassData* GetClassData() const final;

 public:
  ::google::protobuf::Metadata GetMetadata() const;
  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------
  enum : int {
    kStabAttackFieldNumber = 1,
    kSlashAttackFieldNumber = 2,
    kCrushAttackFieldNumber = 3,
    kRangedAttackFieldNumber = 4,
    kMagicAttackFieldNumber = 5,
    kStabDefenceFieldNumber = 6,
    kSlashDefenceFieldNumber = 7,
    kCrushDefenceFieldNumber = 8,
    kRangedDefenceFieldNumber = 9,
    kMagicDefenceFieldNumber = 10,
    kMeleeStrengthFieldNumber = 11,
    kRangedStrengthFieldNumber = 12,
    kMagicDamageFieldNumber = 13,
    kPrayerFieldNumber = 14,
  };
  // int32 stab_attack = 1;
  void clear_stab_attack() ;
  ::int32_t stab_attack() const;
  void set_stab_attack(::int32_t value);

  private:
  ::int32_t _internal_stab_attack() const;
  void _internal_set_stab_attack(::int32_t value);

  public:
  // int32 slash_attack = 2;
  void clear_slash_attack() ;
  ::int32_t slash_attack() const;
  void set_slash_attack(::int32_t value);

  private:
  ::int32_t _internal_slash_attack() const;
  void _internal_set_slash_attack(::int32_t value);

  public:
  // int32 crush_attack = 3;
  void clear_crush_attack() ;
  ::int32_t crush_attack() const;
  void set_crush_attack(::int32_t value);

  private:
  ::int32_t _internal_crush_attack() const;
  void _internal_set_crush_attack(::int32_t value);

  public:
  // int32 ranged_attack = 4;
  void clear_ranged_attack() ;
  ::int32_t ranged_attack() const;
  void set_ranged_attack(::int32_t value);

  private:
  ::int32_t _internal_ranged_attack() const;
  void _internal_set_ranged_attack(::int32_t value);

  public:
  // int32 magic_attack = 5;
  void clear_magic_attack() ;
  ::int32_t magic_attack() const;
  void set_magic_attack(::int32_t value);

  private:
  ::int32_t _internal_magic_attack() const;
  void _internal_set_magic_attack(::int32_t value);

  public:
  // int32 stab_defence = 6;
  void clear_stab_defence() ;
  ::int32_t stab_defence() const;
  void set_stab_defence(::int32_t value);

  private:
  ::int32_t _internal_stab_defence() const;
  void _internal_set_stab_defence(::int32_t value);

  public:
  // int32 slash_defence = 7;
  void clear_slash_defence() ;
  ::int32_t slash_defence() const;
  void set_slash_defence(::int32_t value);

  private:
  ::int32_t _internal_slash_defence() const;
  void _internal_set_slash_defence(::int32_t value);

  public:
  // int32 crush_defence = 8;
  void clear_crush_defence() ;
  ::int32_t crush_defence() const;
  void set_crush_defence(::int32_t value);

  private:
  ::int32_t _internal_crush_defence() const;
  void _internal_set_crush_defence(::int32_t value);

  public:
  // int32 ranged_defence = 9;
  void clear_ranged_defence() ;
  ::int32_t ranged_defence() const;
  void set_ranged_defence(::int32_t value);

  private:
  ::int32_t _internal_ranged_defence() const;
  void _internal_set_ranged_defence(::int32_t value);

  public:
  // int32 magic_defence = 10;
  void clear_magic_defence() ;
  ::int32_t magic_defence() const;
  void set_magic_defence(::int32_t value);

  private:
  ::int32_t _internal_magic_defence() const;
  void _internal_set_magic_defence(::int32_t value);

  public:
  // int32 melee_strength = 11;
  void clear_melee_strength() ;
  ::int32_t melee_strength() const;
  void set_melee_strength(::int32_t value);

  private:
  ::int32_t _internal_melee_strength() const;
  void _internal_set_melee_strength(::int32_t value);

  public:
  // int32 ranged_strength = 12;
  void clear_ranged_strength() ;
  ::int32_t ranged_strength() const;
  void set_ranged_strength(::int32_t value);

  private:
  ::int32_t _internal_ranged_strength() const;
  void _internal_set_ranged_strength(::int32_t value);

  public:
  // double magic_damage = 13;
  void clear_magic_damage() ;
  double magic_damage() const;
  void set_magic_damage(double value);

  private:
  double _internal_magic_damage() const;
  void _internal_set_magic_damage(double value);

  public:
  // int32 prayer = 14;
  void clear_prayer() ;
  ::int32_t prayer() const;
  void set_prayer(::int32_t value);

  private:
  ::int32_t _internal_prayer() const;
  void _internal_set_prayer(::int32_t value);

  public:
  // @@protoc_insertion_point(class_scope:github.nkibler7.osrswikiscraper.StatBonuses)
 private:
  class _Internal;
  friend class ::google::protobuf::internal::TcParser;
  static const ::google::protobuf::internal::TcParseTable<
      4, 14, 0,
      0, 2>
      _table_;

  static constexpr const void* _raw_default_instance_ =
      &_StatBonuses_default_instance_;

  friend class ::google::protobuf::MessageLite;
  friend class ::google::protobuf::Arena;
  template <typename T>
  friend class ::google::protobuf::Arena::InternalHelper;
  using InternalArenaConstructable_ = void;
  using DestructorSkippable_ = void;
  struct Impl_ {
    inline explicit constexpr Impl_(
        ::google::protobuf::internal::ConstantInitialized) noexcept;
    inline explicit Impl_(::google::protobuf::internal::InternalVisibility visibility,
                          ::google::protobuf::Arena* arena);
    inline explicit Impl_(::google::protobuf::internal::InternalVisibility visibility,
                          ::google::protobuf::Arena* arena, const Impl_& from,
                          const StatBonuses& from_msg);
    ::int32_t stab_attack_;
    ::int32_t slash_attack_;
    ::int32_t crush_attack_;
    ::int32_t ranged_attack_;
    ::int32_t magic_attack_;
    ::int32_t stab_defence_;
    ::int32_t slash_defence_;
    ::int32_t crush_defence_;
    ::int32_t ranged_defence_;
    ::int32_t magic_defence_;
    ::int32_t melee_strength_;
    ::int32_t ranged_strength_;
    double magic_damage_;
    ::int32_t prayer_;
    mutable ::google::protobuf::internal::CachedSize _cached_size_;
    PROTOBUF_TSAN_DECLARE_MEMBER
  };
  union { Impl_ _impl_; };
  friend struct ::TableStruct_stat_5fbonuses_2eproto;
};

// ===================================================================




// ===================================================================


#ifdef __GNUC__
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// -------------------------------------------------------------------

// StatBonuses

// int32 stab_attack = 1;
inline void StatBonuses::clear_stab_attack() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.stab_attack_ = 0;
}
inline ::int32_t StatBonuses::stab_attack() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.stab_attack)
  return _internal_stab_attack();
}
inline void StatBonuses::set_stab_attack(::int32_t value) {
  _internal_set_stab_attack(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.stab_attack)
}
inline ::int32_t StatBonuses::_internal_stab_attack() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.stab_attack_;
}
inline void StatBonuses::_internal_set_stab_attack(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.stab_attack_ = value;
}

// int32 slash_attack = 2;
inline void StatBonuses::clear_slash_attack() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.slash_attack_ = 0;
}
inline ::int32_t StatBonuses::slash_attack() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.slash_attack)
  return _internal_slash_attack();
}
inline void StatBonuses::set_slash_attack(::int32_t value) {
  _internal_set_slash_attack(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.slash_attack)
}
inline ::int32_t StatBonuses::_internal_slash_attack() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.slash_attack_;
}
inline void StatBonuses::_internal_set_slash_attack(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.slash_attack_ = value;
}

// int32 crush_attack = 3;
inline void StatBonuses::clear_crush_attack() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.crush_attack_ = 0;
}
inline ::int32_t StatBonuses::crush_attack() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.crush_attack)
  return _internal_crush_attack();
}
inline void StatBonuses::set_crush_attack(::int32_t value) {
  _internal_set_crush_attack(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.crush_attack)
}
inline ::int32_t StatBonuses::_internal_crush_attack() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.crush_attack_;
}
inline void StatBonuses::_internal_set_crush_attack(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.crush_attack_ = value;
}

// int32 ranged_attack = 4;
inline void StatBonuses::clear_ranged_attack() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.ranged_attack_ = 0;
}
inline ::int32_t StatBonuses::ranged_attack() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.ranged_attack)
  return _internal_ranged_attack();
}
inline void StatBonuses::set_ranged_attack(::int32_t value) {
  _internal_set_ranged_attack(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.ranged_attack)
}
inline ::int32_t StatBonuses::_internal_ranged_attack() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.ranged_attack_;
}
inline void StatBonuses::_internal_set_ranged_attack(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.ranged_attack_ = value;
}

// int32 magic_attack = 5;
inline void StatBonuses::clear_magic_attack() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.magic_attack_ = 0;
}
inline ::int32_t StatBonuses::magic_attack() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.magic_attack)
  return _internal_magic_attack();
}
inline void StatBonuses::set_magic_attack(::int32_t value) {
  _internal_set_magic_attack(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.magic_attack)
}
inline ::int32_t StatBonuses::_internal_magic_attack() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.magic_attack_;
}
inline void StatBonuses::_internal_set_magic_attack(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.magic_attack_ = value;
}

// int32 stab_defence = 6;
inline void StatBonuses::clear_stab_defence() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.stab_defence_ = 0;
}
inline ::int32_t StatBonuses::stab_defence() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.stab_defence)
  return _internal_stab_defence();
}
inline void StatBonuses::set_stab_defence(::int32_t value) {
  _internal_set_stab_defence(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.stab_defence)
}
inline ::int32_t StatBonuses::_internal_stab_defence() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.stab_defence_;
}
inline void StatBonuses::_internal_set_stab_defence(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.stab_defence_ = value;
}

// int32 slash_defence = 7;
inline void StatBonuses::clear_slash_defence() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.slash_defence_ = 0;
}
inline ::int32_t StatBonuses::slash_defence() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.slash_defence)
  return _internal_slash_defence();
}
inline void StatBonuses::set_slash_defence(::int32_t value) {
  _internal_set_slash_defence(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.slash_defence)
}
inline ::int32_t StatBonuses::_internal_slash_defence() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.slash_defence_;
}
inline void StatBonuses::_internal_set_slash_defence(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.slash_defence_ = value;
}

// int32 crush_defence = 8;
inline void StatBonuses::clear_crush_defence() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.crush_defence_ = 0;
}
inline ::int32_t StatBonuses::crush_defence() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.crush_defence)
  return _internal_crush_defence();
}
inline void StatBonuses::set_crush_defence(::int32_t value) {
  _internal_set_crush_defence(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.crush_defence)
}
inline ::int32_t StatBonuses::_internal_crush_defence() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.crush_defence_;
}
inline void StatBonuses::_internal_set_crush_defence(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.crush_defence_ = value;
}

// int32 ranged_defence = 9;
inline void StatBonuses::clear_ranged_defence() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.ranged_defence_ = 0;
}
inline ::int32_t StatBonuses::ranged_defence() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.ranged_defence)
  return _internal_ranged_defence();
}
inline void StatBonuses::set_ranged_defence(::int32_t value) {
  _internal_set_ranged_defence(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.ranged_defence)
}
inline ::int32_t StatBonuses::_internal_ranged_defence() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.ranged_defence_;
}
inline void StatBonuses::_internal_set_ranged_defence(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.ranged_defence_ = value;
}

// int32 magic_defence = 10;
inline void StatBonuses::clear_magic_defence() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.magic_defence_ = 0;
}
inline ::int32_t StatBonuses::magic_defence() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.magic_defence)
  return _internal_magic_defence();
}
inline void StatBonuses::set_magic_defence(::int32_t value) {
  _internal_set_magic_defence(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.magic_defence)
}
inline ::int32_t StatBonuses::_internal_magic_defence() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.magic_defence_;
}
inline void StatBonuses::_internal_set_magic_defence(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.magic_defence_ = value;
}

// int32 melee_strength = 11;
inline void StatBonuses::clear_melee_strength() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.melee_strength_ = 0;
}
inline ::int32_t StatBonuses::melee_strength() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.melee_strength)
  return _internal_melee_strength();
}
inline void StatBonuses::set_melee_strength(::int32_t value) {
  _internal_set_melee_strength(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.melee_strength)
}
inline ::int32_t StatBonuses::_internal_melee_strength() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.melee_strength_;
}
inline void StatBonuses::_internal_set_melee_strength(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.melee_strength_ = value;
}

// int32 ranged_strength = 12;
inline void StatBonuses::clear_ranged_strength() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.ranged_strength_ = 0;
}
inline ::int32_t StatBonuses::ranged_strength() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.ranged_strength)
  return _internal_ranged_strength();
}
inline void StatBonuses::set_ranged_strength(::int32_t value) {
  _internal_set_ranged_strength(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.ranged_strength)
}
inline ::int32_t StatBonuses::_internal_ranged_strength() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.ranged_strength_;
}
inline void StatBonuses::_internal_set_ranged_strength(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.ranged_strength_ = value;
}

// double magic_damage = 13;
inline void StatBonuses::clear_magic_damage() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.magic_damage_ = 0;
}
inline double StatBonuses::magic_damage() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.magic_damage)
  return _internal_magic_damage();
}
inline void StatBonuses::set_magic_damage(double value) {
  _internal_set_magic_damage(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.magic_damage)
}
inline double StatBonuses::_internal_magic_damage() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.magic_damage_;
}
inline void StatBonuses::_internal_set_magic_damage(double value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.magic_damage_ = value;
}

// int32 prayer = 14;
inline void StatBonuses::clear_prayer() {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.prayer_ = 0;
}
inline ::int32_t StatBonuses::prayer() const {
  // @@protoc_insertion_point(field_get:github.nkibler7.osrswikiscraper.StatBonuses.prayer)
  return _internal_prayer();
}
inline void StatBonuses::set_prayer(::int32_t value) {
  _internal_set_prayer(value);
  // @@protoc_insertion_point(field_set:github.nkibler7.osrswikiscraper.StatBonuses.prayer)
}
inline ::int32_t StatBonuses::_internal_prayer() const {
  ::google::protobuf::internal::TSanRead(&_impl_);
  return _impl_.prayer_;
}
inline void StatBonuses::_internal_set_prayer(::int32_t value) {
  ::google::protobuf::internal::TSanWrite(&_impl_);
  _impl_.prayer_ = value;
}

#ifdef __GNUC__
#pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)
}  // namespace osrswikiscraper
}  // namespace nkibler7
}  // namespace github


// @@protoc_insertion_point(global_scope)

#include "google/protobuf/port_undef.inc"

#endif  // GOOGLE_PROTOBUF_INCLUDED_stat_5fbonuses_2eproto_2epb_2eh
